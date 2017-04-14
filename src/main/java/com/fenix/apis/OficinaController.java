package com.fenix.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fenix.entities.Oficina;
import com.fenix.services.OficinaService;

@RestController
@RequestMapping(value="/oficina")
public class OficinaController {

	@Autowired
	private OficinaService oficinaService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Oficina save(@RequestBody Oficina oficina) {
		return this.oficinaService.save(oficina);
	}
	
	@RequestMapping(value="/findall")
	public List<Oficina> findAll() {
		return this.oficinaService.findAll(); 
	}
	

	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public void delete(@PathVariable Long id) {
		this.oficinaService.delete(id); 
	}	
	
}
