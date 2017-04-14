package com.fenix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenix.entities.Oficina;
import com.fenix.repositories.OficinaRepository;

@Service
public class OficinaService {

	@Autowired
	private CounterService counterService;
	@Autowired
	private OficinaRepository oficinaRepository;

	public Oficina save(Oficina oficina) {
		if(oficina.getId() == null || oficina.getId() <= 0)
			oficina.setId(this.counterService.getNextSequence("seq_oficina"));
		return this.oficinaRepository.save(oficina);
	}

}