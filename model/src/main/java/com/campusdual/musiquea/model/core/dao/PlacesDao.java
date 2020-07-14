package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("PlacesDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/PlacesDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class PlacesDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_PLACE_ID = "place_id";
	public static final String ATTR_PLACE_NAME = "place_name";
	public static final String ATTR_CITY = "city";
	public static final String ATTR_PROVINCE = "province";
	public static final String ATTR_ADDRESS = "address";
	public static final String ATTR_ZIP_CODE = "zip_code";
	public static final String ATTR_COUNTRY = "country";

}