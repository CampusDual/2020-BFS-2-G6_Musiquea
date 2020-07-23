package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ConcertsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ConcertsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ConcertsDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_CONCERT_ID = "concert_id";
	public static final String ATTR_CONCERT_NAME = "concert_name";
	public static final String ATTR_CONCERT_URL = "concert_url";
	public static final String ATTR_CONCERT_DATE = "concert_date";
	public static final String ATTR_CONCERT_IMAGE = "concert_image";
	public static final String ATTR_PLACE_ID = "place_id";
	public static final String ATTR_ARTIST_ID = "artist_id";
	public static final String ATTR_TYPE_ID = "type_id";

}