package com.fenix.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fenix.entities.Endereco;
import com.fenix.services.EnderecoService;

@RestController
@RequestMapping(value="/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Endereco save(@RequestBody Endereco endereco) {
		System.out.println(endereco);
		return this.enderecoService.save(endereco);
	}

	@RequestMapping(value="/findone/{id}")
	public Endereco findOne(@PathVariable Long id) {
		return this.enderecoService.findOne(id); 
	}	

	@RequestMapping(value="/findbyoficina/{oficinaId}")
	public Endereco findByOficina(@PathVariable Long oficinaId) {
		return this.enderecoService.findByOficinaId(oficinaId); 
	}	
	
	@RequestMapping(value="/findall")
	public List<Endereco> findAll() {
		return this.enderecoService.findAll(); 
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public void delete(@PathVariable Long id) {
		this.enderecoService.delete(id); 
	}	
	
}
