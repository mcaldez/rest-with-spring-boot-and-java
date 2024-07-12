package com.br.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.br.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		logger.info("Findig all people");
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons ;
	}
	
	public Person findById(String id) {
		
		logger.info("Findig one person");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Belen");
		person.setLastName("Caldez");
		person.setAddress("Floripa - Santa Catarina - Brasil");
		person.setGender("female");
		return person;
	}
	
	public Person create(Person person) {
		logger.info("Create person");
		
		return person;
	}
	
	public Person update(Person person) {
		logger.info("Updating person");
		
		return person;
	}
	
	public void delete(String di) {
		logger.info("Deleting person");
		
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some address in Brasil " + i);
		person.setGender("female");
		return person;
	}
	
}
