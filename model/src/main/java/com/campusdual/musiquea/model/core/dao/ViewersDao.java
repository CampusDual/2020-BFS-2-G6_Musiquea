package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ViewersDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ViewersDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ViewersDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_VIEWER_ID = "VIEWER_ID";
 public static final String ATTR_COUNT_VIEWERS = "COUNT_VIEWERS";
 public static final String ATTR_CONCERT_ID = "CONCERT_ID";
 
}