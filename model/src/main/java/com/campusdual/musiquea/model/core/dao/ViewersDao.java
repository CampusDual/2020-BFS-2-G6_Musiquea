package com.campusdual.musiquea.model.core.dao;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.SQLWarningException;
import org.springframework.stereotype.Repository;

import com.ontimize.db.EntityResult;
import com.ontimize.db.SQLStatementBuilder.SQLStatement;
import com.ontimize.jee.common.naming.I18NNaming;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ViewersDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ViewersDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ViewersDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_VIEWER_ID = "viewer_id";
	public static final String ATTR_COUNT_VIEWERS = "count_viewers";
	public static final String ATTR_CONCERT_ID = "concert_id";

	@Override
	protected EntityResult innerUpdate(Map<?, ?> attributesValues, Map<?, ?> keysValues, boolean safe) {
		this.checkCompiled();
		final EntityResult erResult = new EntityResult();
		// Check the primary keys
		final Map<?, ?> avWithoutMultipleTableAttributes = this.processMultipleTableAttribute(attributesValues);
		final Map<?, ?> avWithoutReferenceAttributes = this
				.processReferenceDataFieldAttributes(avWithoutMultipleTableAttributes);
		final Map<?, ?> avWithoutMultipleValue = this.processMultipleValueAttributes(avWithoutReferenceAttributes);
		final Map<?, ?> kvWithoutMulpleTableAttributes = this.processMultipleTableAttribute(keysValues);
		final Map<?, ?> kvWithoutReferenceAttributessRef = this
				.processReferenceDataFieldAttributes(kvWithoutMulpleTableAttributes);
		final Map<String, ?> hValidAttributesValues = this.getValidAttributes(avWithoutMultipleValue);
		Map<?, ?> hValidKeysValues = null;
		if (safe) {
			hValidKeysValues = this.getValidUpdatingKeysValues(kvWithoutReferenceAttributessRef);
			this.checkUpdateKeys(hValidKeysValues);
		} else {
			hValidKeysValues = kvWithoutReferenceAttributessRef;
		}
		if (hValidAttributesValues.isEmpty() || (safe && hValidKeysValues.isEmpty())) {
			OntimizeJdbcDaoSupport.logger.debug("Update:  Attributes or Keys do not contain any pair key-value valid");
			throw new SQLWarningException(I18NNaming.M_IT_HAS_NOT_CHANGED_ANY_RECORD, null);
		}
		final SQLStatement stSQL = this.getStatementHandler().createUpdateQuery(this.getSchemaTable(),
				new Hashtable<>(hValidAttributesValues), new Hashtable<>(hValidKeysValues));
		final String sqlQuery = stSQL.getSQLStatement();
		final List<?> vValues = this.processNullValues(stSQL.getValues());
		final int update = this.getJdbcTemplate().update(sqlQuery, vValues.toArray());
		if (update == 0) {
			erResult.setCode(EntityResult.OPERATION_SUCCESSFUL_SHOW_MESSAGE);
			erResult.setMessage(I18NNaming.M_IT_HAS_NOT_CHANGED_ANY_RECORD);
		}
		return erResult;
	}

}