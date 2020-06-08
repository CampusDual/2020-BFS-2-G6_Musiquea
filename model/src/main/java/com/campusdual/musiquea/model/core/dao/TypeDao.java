package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("TypeDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/TypeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class TypeDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_TYPE_ID = "TYPE_ID";
 public static final String ATTR_TYPE_NAME = "TYPE_NAME";
 
}