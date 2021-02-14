package vip.yazilim.basics.jpa.dao;

import java.util.List;

import vip.yazilim.basics.jpa.entity.Person;

/**
 * Person Repository to get data from database
 * 
 * @author Emre Sen - Aug 18, 2018
 *
 */
public interface IPersonRepo {

    // ...
    Person insert(Person person);

    Person update(Person person);

    void delete(int id);

    // ...
    List<Person> findAll();

    Person findById(int id);


}
