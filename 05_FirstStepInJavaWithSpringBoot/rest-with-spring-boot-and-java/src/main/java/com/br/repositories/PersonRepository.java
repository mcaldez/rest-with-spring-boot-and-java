package com.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{}
