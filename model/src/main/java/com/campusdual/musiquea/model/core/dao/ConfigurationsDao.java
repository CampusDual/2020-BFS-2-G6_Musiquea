package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ConfigurationsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ConfigurationsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ConfigurationsDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_CONFIGURATION_ID = "CONFIGURATION_ID";
 public static final String ATTR_RESET_TIME_RECOMMENDATIONS = "RESET_TIME_RECOMMENDATIONS";
 public static final String ATTR_MAX_CONCERT_RECOMMENDATIONS = "MAX_CONCERT_RECOMMENDATIONS";
 public static final String ATTR_RESET_LAST_DAY = "RESET_LAST_DAY";
 
}