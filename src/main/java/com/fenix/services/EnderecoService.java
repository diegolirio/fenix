package com.fenix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenix.entities.Endereco;
import com.fenix.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private CounterService counterService;

	public Endereco save(Endereco endereco) {
		if(endereco.getId() == null || endereco.getId() <= 0)
			endereco.setId(this.counterService.getNextSequence("seq_endereco"));		
		return this.enderecoRepository.save(endereco);
	}

	public Endereco findOne(Long id) {
		return this.enderecoRepository.findOne(id);
	}

	public List<Endereco> findAll() {
		return this.enderecoRepository.findAll();
	}

	public void delete(Long id) {
		this.enderecoRepository.delete(id);
	}

	public Endereco findByOficinaId(Long oficinaId) {
		return this.enderecoRepository.findByOficinaId(oficinaId);
	}

}
