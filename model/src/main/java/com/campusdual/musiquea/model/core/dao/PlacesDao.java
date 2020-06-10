package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("PlacesDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/PlacesDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class PlacesDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_PLACE_ID = "PLACE_ID";
 public static final String ATTR_PLACE_NAME = "PLACE_NAME";
 public static final String ATTR_CITY = "CITY";
 public static final String ATTR_PROVINCE = "PROVINCE";
 public static final String ATTR_ADDRESS = "ADDRESS";
 public static final String ATTR_ZIP_CODE = "ZIP_CODE";
 public static final String ATTR_COUNTRY = "COUNTRY";
 
}