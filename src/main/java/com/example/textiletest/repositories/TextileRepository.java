package com.example.textiletest.repositories;

import com.example.textiletest.entities.Textile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextileRepository extends CrudRepository<Textile, Long> {

}
