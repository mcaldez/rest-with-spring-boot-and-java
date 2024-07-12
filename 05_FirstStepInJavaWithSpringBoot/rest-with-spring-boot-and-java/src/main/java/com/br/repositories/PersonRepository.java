package com.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
