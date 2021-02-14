package vip.yazilim.basics.springdatacore.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vip.yazilim.basics.springdatacore.entity.Person;
import vip.yazilim.basics.springdatacore.repo.IPersonJpaRepo;

@Repository
@Transactional
public class PersonService implements IPersonService {

	@Autowired
	private IPersonJpaRepo personJpaRepo;

	@Override
	public Person insert(Person person) {
		return personJpaRepo.save(person);
	}

	@Override
	public Person update(Person person) {
		return personJpaRepo.save(person);
	}

	@Override
	public void delete(int id) {
		Person person = this.findById(id);
		personJpaRepo.delete(person);
	}

	@Override
	public List<Person> findAll() {
		return personJpaRepo.findAll();
	}

	@Override
	public Person findById(int id) {
		return personJpaRepo.findById(id).orElseGet(Person::new);
	}

	@Override
	public Person findFirstByNameAsc() {
		return personJpaRepo.findFirstByOrderByNameAsc();
	}

	@Override
	public List<Person> findByName(String name) {
		return personJpaRepo.findByName(name);
	}

	@Override
	public List<Person> findByLocation(String location) {
		Stream<Person> stream = personJpaRepo.findByQuery();	
		return stream.filter(item -> item.getLocation().equalsIgnoreCase(location)).collect(Collectors.toList());
	}
	
	

}
