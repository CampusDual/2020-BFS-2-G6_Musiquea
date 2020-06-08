package com.campusdual.musiquea.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.campusdual.musiquea.api.core.service.ICollaboratorsService;
import com.ontimize.db.EntityResult;
import com.ontimize.hr.model.core.dao.CollaboratorsDao;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("CollaboratorsService")
@Lazy
public class CollaboratorsService implements ICollaboratorsService {

	@Autowired
	private CollaboratorsDao collaboratorsDao;

	@Override
	public EntityResult collaboratorsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.collaboratorsDao, keyMap, attrlist);
	}

	@Override
	public EntityResult collaboratorsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.collaboratorsDao, attrMap);
	}

	@Override
	public EntityResult collaboratorsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.collaboratorsDao, attrMap, keyMap);
	}

	@Override
	public EntityResult collaboratorsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.collaboratorsDao, keyMap);
	}

}
