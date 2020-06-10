package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ArtistsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ArtistsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ArtistsDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ARTISTS_ID = "ARTISTS_ID";
 public static final String ATTR_ARTISTS_NAME = "ARTISTS_NAME";
 public static final String ATTR_ARTISTS_IMAGE = "ARTISTS_IMAGE";
 
}