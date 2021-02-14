package vip.yazilim.basics.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vip.yazilim.basics.jpa.dao.IPersonRepo;
import vip.yazilim.basics.jpa.entity.Person;

import java.util.Date;

@SpringBootApplication
public class JpaHibernateApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(JpaHibernateApplication.class, args);


        IPersonRepo personRepo = ctx.getBean(IPersonRepo.class);

        /* insert persons */
        System.out.println("\nInsert Example");
        personRepo.insert(new Person(1, "Canberk", "Antalya", new Date()));
        personRepo.insert(new Person(2, "Melike", "Antalya", new Date()));
        personRepo.insert(new Person(3, "Anıl", "Antalya", new Date()));
        personRepo.insert(new Person(4, "Emre", "Antalya", new Date()));
        personRepo.insert(new Person(5, "Burak", "Antalya", new Date()));

        // print results
        personRepo.findAll().forEach(System.out::println);

        /* find by id */
        System.out.println("\nFind By Id");
        Person person = personRepo.findById(5);
        System.out.println("Find Person => "+person);

        /* update */
        System.out.println("\nUpdate Example");
        person.setLocation("Çorum");
        personRepo.update(person);

        // print results
        personRepo.findAll().forEach(System.out::println);

        /* delete */
        System.out.println("\nDelete Example");
        personRepo.delete(person.getId());

        // print results
        personRepo.findAll().forEach(System.out::println);

    }


}
