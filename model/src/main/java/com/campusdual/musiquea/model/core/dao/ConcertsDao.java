package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ConcertsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ConcertsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ConcertsDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_CONCERT_ID = "CONCERT_ID";
 public static final String ATTR_CONCERT_NAME = "CONCERT_NAME";
 public static final String ATTR_CONCERT_URL = "CONCERT_URL";
 public static final String ATTR_CONCERT_DATE = "CONCERT_DATE";
 public static final String ATTR_CONCERT_IMAGE = "CONCERT_IMAGE";
 public static final String ATTR_PLACE_ID = "PLACE_ID";
 public static final String ATTR_ARTIST_ID = "ARTIST_ID";
 public static final String ATTR_TYPE_ID = "TYPE_ID";
 
}