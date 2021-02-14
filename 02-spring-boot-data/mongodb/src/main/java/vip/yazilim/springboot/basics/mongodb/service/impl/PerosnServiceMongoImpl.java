package vip.yazilim.springboot.basics.mongodb.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vip.yazilim.springboot.basics.mongodb.entity.Person;
import vip.yazilim.springboot.basics.mongodb.repository.IPersonRepository;
import vip.yazilim.springboot.basics.mongodb.service.IPersonService;

/**
 *
 * @author Emre Sen
 * @date Jan 23, 2019
 * @contact maemresen07@gmail.com
 */
@Component
public class PerosnServiceMongoImpl implements IPersonService {

    @Autowired
    private IPersonRepository repository;

    @Override
    public Person insert(Person person) {
        repository.save(person);
        return person;
    }

    @Override
    public Person update(Person person) {
        repository.save(person);
        return person;
    }

    @Override
    public void delete(int id) {
        Optional<Person> person = repository.findById(id);
        if (person.isPresent()) {
            repository.delete(person.get());
        }
    }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public Person findById(int id) {
        Optional<Person> person = repository.findById(id);
        if (person.isPresent()) {
            return person.get();
        }
        return null;
    }

    @Override
    public Person findFirstByNameAsc() {
        return repository.findFirstByOrderByNameAsc();
    }

    @Override
    public List<Person> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Person> findByLocation(String location) {
        return repository.findByLocation(location);
    }

}
