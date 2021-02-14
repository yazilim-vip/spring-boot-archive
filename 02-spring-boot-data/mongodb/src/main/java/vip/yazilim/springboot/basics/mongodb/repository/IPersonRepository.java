package vip.yazilim.springboot.basics.mongodb.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import vip.yazilim.springboot.basics.mongodb.entity.Person;

/**
 *
 * @author Emre Sen
 * @date Jan 23, 2019
 * @contact maemresen07@gmail.com
 */
public interface IPersonRepository extends MongoRepository<Person, Integer> {

    public Person findFirstByOrderByNameAsc();

    public List<Person> findByName(String name);

    public List<Person> findByLocation(String location);

}
