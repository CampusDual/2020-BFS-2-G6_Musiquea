package com.campusdual.musiquea.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.campusdual.musiquea.api.core.service.IArtistsService;
import com.campusdual.musiquea.model.core.dao.ArtistsDao;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("ArtistsService")
@Lazy
public class ArtistsService implements IArtistsService {

	@Autowired
	private ArtistsDao artistsDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult artistsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.artistsDao, keyMap, attrlist);
	}

	@Override
	public EntityResult artistsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.artistsDao, attrMap);
	}

	@Override
	public EntityResult artistsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.artistsDao, attrMap, keyMap);
	}

	@Override
	public EntityResult artistsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.artistsDao, keyMap);
	}

}
