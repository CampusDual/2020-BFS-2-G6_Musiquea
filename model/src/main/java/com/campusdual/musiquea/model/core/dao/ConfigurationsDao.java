package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ConfigurationsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ConfigurationsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ConfigurationsDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_CONFIGURATION_ID = "configuration_id";
	public static final String ATTR_RESET_TIME_RECOMMENDATIONS = "reset_time_recommendations";
	public static final String ATTR_MAX_CONCERT_RECOMMENDATIONS = "max_concert_recommendations";
	public static final String ATTR_RESET_LAST_DAY = "reset_last_day";

}