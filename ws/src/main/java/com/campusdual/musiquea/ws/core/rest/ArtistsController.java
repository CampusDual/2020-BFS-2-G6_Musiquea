package com.campusdual.musiquea.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusdual.musiquea.api.core.service.IArtistsService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/artists")
@ComponentScan(basePackageClasses = { com.campusdual.musiquea.api.core.service.IArtistsService.class })
public class ArtistsController extends ORestController<IArtistsService> {

	@Autowired
	private IArtistsService artistsService;

	@Override
	public IArtistsService getService() {
		return this.artistsService;
	}
}