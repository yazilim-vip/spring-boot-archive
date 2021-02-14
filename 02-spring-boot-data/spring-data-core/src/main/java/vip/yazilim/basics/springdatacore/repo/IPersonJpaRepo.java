package vip.yazilim.basics.springdatacore.repo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import vip.yazilim.basics.springdatacore.entity.Person;

public interface IPersonJpaRepo extends JpaRepository<Person, Integer> {

	public Person findFirstByOrderByNameAsc();
	
	public List<Person> findByName(String name);
	
	@Query("select p from Person p")
	public Stream<Person> findByQuery();

}
