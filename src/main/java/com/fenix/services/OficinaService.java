package com.fenix.services;

import java.util.List;

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

	public List<Oficina> findAll() {
		return this.oficinaRepository.findAll();
	}

	public void delete(Long id) {
		this.oficinaRepository.delete(id);
	}

	public Oficina findOne(Long id) {
		return this.oficinaRepository.findOne(id);
	}

}
