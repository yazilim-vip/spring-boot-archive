package vip.yazilim.springboot.basics.mongodb.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Emre Sen
 * @date Jan 23, 2019
 * @contact maemresen07@gmail.com
 */


public class Person {

    @Id
    private int id;
    private String name;
    private String location;
    private Date birthDate;


    public Person(int id, String name, String location, Date birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
