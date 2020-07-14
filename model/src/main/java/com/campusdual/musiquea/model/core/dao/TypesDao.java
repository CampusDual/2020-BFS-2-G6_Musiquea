package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("TypesDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/TypesDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class TypesDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_TYPE_ID = "type_id";
	public static final String ATTR_TYPE_NAME = "type_name";

}
