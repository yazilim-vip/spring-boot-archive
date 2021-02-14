package vip.yazilim.basics.mybatis.entity;


import java.util.Date;

public class Person {


    private int personId;
    private String name;
    private String location;
    private Date birthDate;


    public Person(int personId, String name, String location, Date birthDate) {
        this.personId = personId;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }
    public Person(String name, String location, Date birthDate) {
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

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}


