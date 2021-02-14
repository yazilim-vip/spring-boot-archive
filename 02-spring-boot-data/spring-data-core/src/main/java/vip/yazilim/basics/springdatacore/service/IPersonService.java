package vip.yazilim.basics.springdatacore.service;

import java.util.List;

import vip.yazilim.basics.springdatacore.entity.Person;

public interface IPersonService {

    // ...
    Person insert(Person person);

    Person update(Person person);

    void delete(int id);

    // ...
    List<Person> findAll();

    Person findById(int id);

    Person findFirstByNameAsc();
    
    List<Person> findByName(String name);
    
    List<Person> findByLocation(String location);

}
