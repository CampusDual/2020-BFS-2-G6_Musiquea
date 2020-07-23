package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ArtistsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ArtistsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ArtistsDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ARTIST_ID = "artist_id";
	public static final String ATTR_ARTIST_NAME = "artist_name";
	public static final String ATTR_ARTIST_IMAGE = "artist_image";

}