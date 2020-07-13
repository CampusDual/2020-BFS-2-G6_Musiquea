package com.campusdual.musiquea.api.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IConcertsService {

	public EntityResult concertsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException;

	public EntityResult concertsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult concertsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult concertsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult recommendedConcertsQuery() throws OntimizeJEERuntimeException;
	
	public EntityResult searchedConcertQuery(Map<String, Object> req) throws OntimizeJEERuntimeException;

	public EntityResult viewersQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException;

	public EntityResult viewersInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult viewersUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult viewersDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult typesQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException;

	public EntityResult typesInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult typesUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult typesDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult placesQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException;

	public EntityResult placesInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult placesUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult placesDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult collaboratorsConcertsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException;

	public EntityResult collaboratorsConcertsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult collaboratorsConcertsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult collaboratorsConcertsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult configurationsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException;

	public EntityResult configurationsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

	public EntityResult configurationsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException;

	public EntityResult configurationsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

}
