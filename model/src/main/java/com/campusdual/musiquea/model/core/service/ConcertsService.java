package com.campusdual.musiquea.model.core.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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
import com.ontimize.db.SQLStatementBuilder;
import com.ontimize.db.SQLStatementBuilder.BasicExpression;
import com.ontimize.db.SQLStatementBuilder.BasicField;
import com.ontimize.db.SQLStatementBuilder.BasicOperator;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("ConcertsService")
@Lazy
public class ConcertsService implements IConcertsService {

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
		Map<String, Object> key = new HashMap<String, Object>();
		key.put(SQLStatementBuilder.ExtendedSQLConditionValuesProcessor.EXPRESSION_KEY,
				searchRecommended(ConcertsDao.ATTR_CONCERT_DATE));

		return this.daoHelper.query(this.concertsDao, key,
				Arrays.asList(ConcertsDao.ATTR_CONCERT_ID, ConcertsDao.ATTR_CONCERT_IMAGE,
						ConcertsDao.ATTR_CONCERT_DATE, ConcertsDao.ATTR_TYPE_ID, PlacesDao.ATTR_PLACE_NAME,
						PlacesDao.ATTR_CITY, ViewersDao.ATTR_COUNT_VIEWERS, ArtistsDao.ATTR_ARTIST_NAME,
						"collaborators"),
				"recommendedConcerts");
	}

	private int getMaxConcertRecommended() {
		EntityResult config = this.configurationsQuery(new HashMap<String, Object>(),
				Arrays.asList(ConfigurationsDao.ATTR_MAX_CONCERT_RECOMMENDATIONS));

		String[] parts1 = config.get(ConfigurationsDao.ATTR_MAX_CONCERT_RECOMMENDATIONS).toString().split("\\[");
		String[] parts2 = parts1[1].split("\\]");
		String numberRecommeded = parts2[0];

		return Integer.parseInt(numberRecommeded);
	}

	private BasicExpression searchRecommended(String param) {
		Date startDate = new Date();
		startDate.getTime();

		BasicField field = new BasicField(param);
		return new BasicExpression(field, BasicOperator.MORE_EQUAL_OP, startDate);
	}

	@Override
	public EntityResult concertDetailsQuery(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
		try {
			Map<String, Object> concertIdSelected = (Map<String, Object>) keyMap.get("filter");
			int concertId = (int) concertIdSelected.get("concert_id");

			EntityResult baseQuery = this.daoHelper.query(this.concertsDao, new HashMap<String, Object>(),
					Arrays.asList(ConcertsDao.ATTR_CONCERT_ID, ArtistsDao.ATTR_ARTIST_IMAGE,
							ArtistsDao.ATTR_ARTIST_NAME, ConcertsDao.ATTR_CONCERT_NAME, ConcertsDao.ATTR_CONCERT_DATE,
							ConcertsDao.ATTR_CONCERT_URL, ConcertsDao.ATTR_CONCERT_IMAGE, ConcertsDao.ATTR_TYPE_ID,
							PlacesDao.ATTR_PLACE_NAME, PlacesDao.ATTR_CITY, PlacesDao.ATTR_PROVINCE, "collaborators",
							"genres"),
					"concertDetails");

			EntityResult finalres = new EntityResult();
			for (int i = 0; i < baseQuery.calculateRecordNumber(); i++) {
				if (baseQuery.getRecordValues(i).get("concert_id").toString().equals(String.valueOf(concertId))) {
					finalres.addRecord(baseQuery.getRecordValues(i));
				}
			}

			EntityResult query = this.viewersQuery(concertIdSelected,
					Arrays.asList(ViewersDao.ATTR_VIEWER_ID, ViewersDao.ATTR_COUNT_VIEWERS));

			if (!query.isEmpty()) {
				int viewerId = Integer.parseInt(query.getRecordValues(0).get("viewer_id").toString());
				int currentCountViewers = Integer.parseInt(query.getRecordValues(0).get("count_viewers").toString());

				Map<String, Object> attrMap = new HashMap<String, Object>();
				attrMap.put(ViewersDao.ATTR_COUNT_VIEWERS, (currentCountViewers + 1));

				Map<String, Object> keysValues = new HashMap<String, Object>();
				keysValues.put("VIEWER_ID", viewerId);

				this.viewersUpdate(attrMap, keysValues);
			}

			return finalres;
		} catch (Exception e) {
			e.printStackTrace();
			EntityResult res = new EntityResult();
			res.setCode(EntityResult.OPERATION_WRONG);
			return res;
		}
	}

	@Override
	public EntityResult searchedConcertQuery(Map<String, Object> req) throws OntimizeJEERuntimeException {
		try {
			Map<String, Object> filter = (Map<String, Object>) req.get("filter");
			String name = new StringBuilder("%").append(filter.get("CONCERT_NAME")).append("%").toString().replace(" ",
					"%");
			String artist = new StringBuilder("%").append(filter.get("ARTIST_NAME")).append("%").toString().replace(" ",
					"%");

			String date = filter.get("CONCERT_DATE").toString();
			String[] date_parts = date.split("_");
			Date start_date = new SimpleDateFormat("yyyy-MM-dd").parse(date_parts[0]);
			Date end_date = new SimpleDateFormat("yyyy-MM-dd").parse(date_parts[1]);

			Map<String, Object> key = new HashMap<String, Object>();
			key.put(SQLStatementBuilder.ExtendedSQLConditionValuesProcessor.EXPRESSION_KEY, new BasicExpression(
					new BasicExpression(searchConcertByName(ConcertsDao.ATTR_CONCERT_NAME, name), BasicOperator.OR_OP,
							searchConcertByArtist(ArtistsDao.ATTR_ARTIST_NAME, artist)),
					BasicOperator.AND_OP, searchConcertByMonth(ConcertsDao.ATTR_CONCERT_DATE, start_date, end_date)));

			return this.daoHelper.query(this.concertsDao, key,
					Arrays.asList(ConcertsDao.ATTR_CONCERT_ID, ConcertsDao.ATTR_CONCERT_IMAGE,
							ConcertsDao.ATTR_CONCERT_DATE, ConcertsDao.ATTR_TYPE_ID, PlacesDao.ATTR_PLACE_NAME,
							PlacesDao.ATTR_CITY, ArtistsDao.ATTR_ARTIST_NAME, "collaborators"),
					"searchedConcert");
		} catch (Exception e) {
			e.printStackTrace();
			EntityResult res = new EntityResult();
			res.setCode(EntityResult.OPERATION_WRONG);
			return res;
		}
	}

	private BasicExpression searchConcertByName(String concertName, String name) {
		BasicField fieldName = new BasicField(concertName);
		BasicExpression concertSearchedByName = new BasicExpression(fieldName, BasicOperator.LIKE_OP, name);
		return concertSearchedByName;
	}

	private BasicExpression searchConcertByArtist(String artistName, String artist) {
		BasicField fieldArtist = new BasicField(artistName);
		BasicExpression concertSearchedByArtist = new BasicExpression(fieldArtist, BasicOperator.LIKE_OP, artist);
		return concertSearchedByArtist;
	}

	private BasicExpression searchConcertByMonth(String concertDate, Date start_date, Date end_date) {
		BasicField fieldDate = new BasicField(concertDate);
		BasicExpression bexp1 = new BasicExpression(fieldDate, BasicOperator.MORE_EQUAL_OP, start_date);
		BasicExpression bexp2 = new BasicExpression(fieldDate, BasicOperator.LESS_EQUAL_OP, end_date);
		return new BasicExpression(bexp1, BasicOperator.AND_OP, bexp2);
	}

}
