package com.fenix.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fenix.entities.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, Long> {

	Endereco findByOficinaId(Long oficinaId);

}
