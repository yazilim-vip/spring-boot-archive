package vip.yazilim.basics.jdbc.service;

import java.util.List;

import vip.yazilim.basics.jdbc.entity.Person;

/**
 * Person Repository to get data from database
 * 
 * @author Emre Sen - Aug 18, 2018
 *
 */
public interface IPersonService {

	// ...
	int insert(Person person);

	boolean update(Person person);

	int delete(int id);

	// ...
	List<Person> findAll();

	Person findById(int id);

}
