package com.fenix.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fenix.entities.Oficina;

@Repository
public interface OficinaRepository extends MongoRepository<Oficina, Long> {

}
