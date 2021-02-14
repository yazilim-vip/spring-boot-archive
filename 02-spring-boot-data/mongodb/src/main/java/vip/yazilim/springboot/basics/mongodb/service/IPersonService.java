package vip.yazilim.springboot.basics.mongodb.service;

import java.util.List;
import vip.yazilim.springboot.basics.mongodb.entity.Person;

/**
 *
 * @author Emre Sen
 * @date Jan 23, 2019
 * @contact maemresen07@gmail.com
 */

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
