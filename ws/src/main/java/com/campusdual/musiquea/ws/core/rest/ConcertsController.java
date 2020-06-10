package com.campusdual.musiquea.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusdual.musiquea.api.core.service.IConcertsService;
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
}