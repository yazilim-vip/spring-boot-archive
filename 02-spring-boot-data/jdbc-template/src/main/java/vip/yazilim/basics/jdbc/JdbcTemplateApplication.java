package vip.yazilim.basics.jdbc;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vip.yazilim.basics.jdbc.entity.Person;
import vip.yazilim.basics.jdbc.service.IPersonService;

@SpringBootApplication
public class JdbcTemplateApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(JdbcTemplateApplication.class, args);


        IPersonService personRepo = ctx.getBean(IPersonService.class);

        // ...
        System.out.println("\nInsert Example");
        int result = personRepo.insert(new Person(5, "New person", "Antalya", new Date()));
        System.out.println("Insert " + ((result > 0) ? "Success" : "Fail"));
        //
        System.out.println("\nFind All Example");
        personRepo.findAll().forEach(System.out::println);

        //
        System.out.println("\nFind By Id Example");
        Person p = personRepo.findById(5);
        System.out.println(p);

        System.out.println("\nUpdate Example");
        p.setName("Anil");
        boolean res = personRepo.update(p);
        System.out.println("Update " + (res ? "Success" : "Fail"));
        System.out.println("\nFind All Example");
        personRepo.findAll().forEach(System.out::println);

        System.out.println("\nDelete Example");
        result = personRepo.delete(5);
        System.out.println("Delete " + ((result > 0) ? "Success" : "Fail"));
        System.out.println("\nFind All Example");
        personRepo.findAll().forEach(System.out::println);

        // add user

    }


}
