package vip.yazilim.basics.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vip.yazilim.basics.mybatis.entity.Person;
import vip.yazilim.basics.mybatis.service.IPersonService;

import java.util.Date;

@SpringBootApplication
public class MyBatisApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(MyBatisApplication.class, args);


        IPersonService personRepo = ctx.getBean(IPersonService.class);

        /* insert persons */
        System.out.println("\nInsert Example");
        personRepo.insert(new Person( "Canberk", "Antalya", new Date()));
        personRepo.insert(new Person( "Melike", "Antalya", new Date()));
        personRepo.insert(new Person( "Anıl", "Antalya", new Date()));
        personRepo.insert(new Person( "Emre", "Antalya", new Date()));
        personRepo.insert(new Person("Burak", "Antalya", new Date()));

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
        personRepo.delete(person.getPersonId());

        // print results
        personRepo.findAll().forEach(System.out::println);

    }


}
