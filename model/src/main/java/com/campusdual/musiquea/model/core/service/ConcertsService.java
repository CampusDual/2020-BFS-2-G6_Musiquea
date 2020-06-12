package com.campusdual.musiquea.model.core.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.campusdual.musiquea.api.core.service.IConcertsService;
import com.campusdual.musiquea.model.core.dao.ArtistsDao;
import com.campusdual.musiquea.model.core.dao.CollaboratorsConcertsDao;
import com.campusdual.musiquea.model.core.dao.ConcertsDao;
import com.campusdual.musiquea.model.core.dao.ConfigurationsDao;
import com.campusdual.musiquea.model.core.dao.PlacesDao;
import com.campusdual.musiquea.model.core.dao.TypesDao;
import com.campusdual.musiquea.model.core.dao.ViewersDao;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("ConcertsService")
@Lazy
public class ConcertsService implements IConcertsService {

	@Autowired
	private ArtistsDao artistsDao;
	@Autowired
	private ConcertsDao concertsDao;
	@Autowired
	private ViewersDao viewersDao;
	@Autowired
	private TypesDao typesDao;
	@Autowired
	private PlacesDao placesDao;
	@Autowired
	private CollaboratorsConcertsDao collaboratorsConcertsDao;
	@Autowired
	private ConfigurationsDao configurationsDao;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult concertsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.concertsDao, keyMap, attrlist);
	}

	@Override
	public EntityResult concertsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.concertsDao, attrMap);
	}

	@Override
	public EntityResult concertsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.concertsDao, attrMap, keyMap);
	}

	@Override
	public EntityResult concertsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.concertsDao, keyMap);
	}

	@Override
	public EntityResult viewersQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.viewersDao, keyMap, attrlist);
	}

	@Override
	public EntityResult viewersInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.viewersDao, attrMap);
	}

	@Override
	public EntityResult viewersUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.viewersDao, attrMap, keyMap);
	}

	@Override
	public EntityResult viewersDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.viewersDao, keyMap);
	}

	@Override
	public EntityResult typesQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.typesDao, keyMap, attrlist);
	}

	@Override
	public EntityResult typesInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.typesDao, attrMap);
	}

	@Override
	public EntityResult typesUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.typesDao, attrMap, keyMap);
	}

	@Override
	public EntityResult typesDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.typesDao, keyMap);
	}

	@Override
	public EntityResult placesQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.placesDao, keyMap, attrlist);
	}

	@Override
	public EntityResult placesInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.placesDao, attrMap);
	}

	@Override
	public EntityResult placesUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.placesDao, attrMap, keyMap);
	}

	@Override
	public EntityResult placesDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.placesDao, keyMap);
	}

	@Override
	public EntityResult collaboratorsConcertsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.collaboratorsConcertsDao, keyMap, attrlist);
	}

	@Override
	public EntityResult collaboratorsConcertsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.collaboratorsConcertsDao, attrMap);
	}

	@Override
	public EntityResult collaboratorsConcertsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.collaboratorsConcertsDao, attrMap, keyMap);
	}

	@Override
	public EntityResult collaboratorsConcertsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.collaboratorsConcertsDao, keyMap);
	}

	@Override
	public EntityResult configurationsQuery(Map<String, Object> keyMap, List<String> attrlist)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.configurationsDao, keyMap, attrlist);
	}

	@Override
	public EntityResult configurationsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.configurationsDao, attrMap);
	}

	@Override
	public EntityResult configurationsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.configurationsDao, attrMap, keyMap);
	}

	@Override
	public EntityResult configurationsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.configurationsDao, keyMap);
	}

	@Override
	public EntityResult recommendedConcertsQuery() throws OntimizeJEERuntimeException {

		EntityResult res = getRecommendedConcerts();

		EntityResult finalRes = new EntityResult();

		for (int i = 0; i < getMaxConcertRecommended(); i++) {
			finalRes.addRecord(res.getRecordValues(i));
		}

		return finalRes;
	}

	private EntityResult getRecommendedConcerts() {
		return this.daoHelper.query(this.concertsDao, new java.util.HashMap(),
				java.util.Arrays.asList(("C." + ConcertsDao.ATTR_CONCERT_ID),
						/* ConcertsDao.ATTR_CONCERT_IMAGE, */ ConcertsDao.ATTR_CONCERT_DATE, ConcertsDao.ATTR_TYPE_ID,
						PlacesDao.ATTR_PLACE_NAME, PlacesDao.ATTR_CITY, ViewersDao.ATTR_COUNT_VIEWERS,
						ArtistsDao.ATTR_ARTIST_NAME),
				"recommendedConcerts");
	}

	private int getMaxConcertRecommended() {
		EntityResult config = this.configurationsQuery(new java.util.HashMap<String, Object>(),
				Arrays.asList(ConfigurationsDao.ATTR_MAX_CONCERT_RECOMMENDATIONS));

		String[] parts1 = config.get(ConfigurationsDao.ATTR_MAX_CONCERT_RECOMMENDATIONS).toString().split("\\[");
		String[] parts2 = parts1[1].split("\\]");
		String numberRecommeded = parts2[0];

		return Integer.parseInt(numberRecommeded);
	}

}
