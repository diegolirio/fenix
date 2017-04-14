package com.fenix.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fenix.entities.Oficina;
import com.fenix.services.OficinaService;

@RestController
@RequestMapping(value="/oficina")
public class OficinaController {

	@Autowired
	private OficinaService oficinaService;
	
	@RequestMapping(value="/save")
	public Oficina save(@RequestBody Oficina oficina) {
		return this.oficinaService.save(oficina);
	}
	
}
