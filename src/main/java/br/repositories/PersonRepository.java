package br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{}
