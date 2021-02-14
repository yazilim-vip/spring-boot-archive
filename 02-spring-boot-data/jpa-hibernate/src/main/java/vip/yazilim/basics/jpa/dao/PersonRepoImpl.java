package vip.yazilim.basics.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;



import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import vip.yazilim.basics.jpa.entity.Person;

/**
 * Implementation of the Person Repository with JPA
 * 
 * @author Emre Sen - Aug 18, 2018
 *
 */
@Repository
@Transactional
public class PersonRepoImpl implements IPersonRepo {

	@PersistenceContext
	private EntityManager jpaTemplate;

	@Override
	public Person insert(Person person) {
		return jpaTemplate.merge(person);
	}

	@Override
	public Person update(Person person) {
		return jpaTemplate.merge(person);
	}

	@Override
	public void delete(int id) {
		Person person = this.findById(id);
		jpaTemplate.remove(person);
	}

	@Override
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = jpaTemplate.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

	@Override
	public Person findById(int id) {
		return jpaTemplate.find(Person.class, id);
	}

}
