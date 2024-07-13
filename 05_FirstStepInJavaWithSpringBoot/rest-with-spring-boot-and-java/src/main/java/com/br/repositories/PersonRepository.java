package com.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.data.vo.v1.PersonVO;


public interface PersonRepository extends JpaRepository<PersonVO, Long>{}
