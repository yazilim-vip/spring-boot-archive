package vip.yazilim.basics.mybatis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vip.yazilim.basics.mybatis.entity.Person;
import vip.yazilim.basics.mybatis.mapper.PersonMapper;

import java.util.List;

@Repository
public class PersonService implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person insert(Person person) {
        personMapper.insertPerson(person);
        return person;
    }

    @Override
    public Person update(Person person) {
        personMapper.update(person);
        return person;
    }

    @Override
    public void delete(int id) {
        personMapper.delete(1,"Canberk");
    }

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @Override
    public Person findById(int id) {
        return personMapper.findById(id);
    }


}
