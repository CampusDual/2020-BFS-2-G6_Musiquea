package com.campusdual.musiquea.ws.core.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusdual.musiquea.api.core.service.IConcertsService;
import com.ontimize.db.EntityResult;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/concerts")
@ComponentScan(basePackageClasses = { com.campusdual.musiquea.api.core.service.IConcertsService.class })
public class ConcertsController extends ORestController<IConcertsService> {

	@Autowired
	private IConcertsService concertsService;

	@Override
	public IConcertsService getService() {
		return this.concertsService;
	}

	@PostMapping(value = "/recommendedConcerts/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public EntityResult getRecommendedConcerts() {
		return this.concertsService.recommendedConcertsQuery();
	}

	@PostMapping(value = "/concertDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public EntityResult getConcertDetails(@RequestBody Map<String, Object> req) {
		return this.concertsService.concertDetailsQuery(req);
	}

	@PostMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public EntityResult getSearchedConcert(@RequestBody Map<String, Object> req) {
		return this.concertsService.searchedConcertQuery(req);
	}
}