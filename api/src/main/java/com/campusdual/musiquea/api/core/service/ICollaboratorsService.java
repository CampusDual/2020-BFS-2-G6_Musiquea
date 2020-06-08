package com.campusdual.musiquea.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface ICollaboratorsService {

	public EntityResult collaboratorsQuery(Map<String, Object> keyMap, List<String> attrlist) throws OntimizeJEERuntimeException;
	public EntityResult collaboratorsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult collaboratorsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult collaboratorsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	
}
