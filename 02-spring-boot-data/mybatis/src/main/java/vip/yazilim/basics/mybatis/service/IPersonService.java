package vip.yazilim.basics.mybatis.service;

import vip.yazilim.basics.mybatis.entity.Person;

import java.util.List;

public interface IPersonService {

    // ...
    Person insert(Person person);

    Person update(Person person);

    void delete(int id);

    // ...
    List<Person> findAll();

    Person findById(int id);


}
