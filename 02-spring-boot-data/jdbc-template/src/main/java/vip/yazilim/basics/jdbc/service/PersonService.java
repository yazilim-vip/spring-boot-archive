package vip.yazilim.basics.jdbc.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import vip.yazilim.basics.jdbc.entity.Person;

/**
 * Implementation of the Person Repository with JDBC template
 * 
 * @author Emre Sen - Aug 18, 2018
 *
 */
@Repository
public class PersonService implements IPersonService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// ...

	@Override
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person (id, name, location, birthDate) values(?, ?, ?, ?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(), person.getBirthDate() });
	}

	@Override
	public boolean update(Person person) {
		int result = jdbcTemplate.update("UPDATE person SET name=?, location=? WHERE id=? ",
				new Object[] { person.getName(), person.getLocation(), person.getId() });
		return result > 0;
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM person WHERE id=?", new Object[] { id });
	}

	// ...

	@Override
	public List<Person> findAll() {
		return jdbcTemplate.query("SELECT * FROM Person", BeanPropertyRowMapper.newInstance(Person.class));
	}

	@Override
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM Person WHERE id=?", new Object[] { id },
				new SpecialCustomerRowMapper());
	}

	private class SpecialCustomerRowMapper implements RowMapper<Person> {
		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getDate("birthDate"));
			return person;
		}
	}
}
