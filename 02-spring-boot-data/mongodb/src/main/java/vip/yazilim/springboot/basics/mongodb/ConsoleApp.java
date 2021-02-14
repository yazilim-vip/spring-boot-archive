package vip.yazilim.springboot.basics.mongodb;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vip.yazilim.springboot.basics.mongodb.entity.Person;
import vip.yazilim.springboot.basics.mongodb.service.IPersonService;

@SpringBootApplication
public class ConsoleApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApp.class, args);

        ConfigurableApplicationContext ctx = SpringApplication.run(ConsoleApp.class, args);

        IPersonService personRepo = ctx.getBean(IPersonService.class);

          /* insert persons */
        System.out.println("\nInsert Example");
        personRepo.insert(new Person(1, "Canberk", "Afyon", new Date()));
        personRepo.insert(new Person(2, "Melike", "Antalya", new Date()));
        personRepo.insert(new Person(3, "Anıl", "Kayseri", new Date()));
        personRepo.insert(new Person(4, "Emre", "Bandırma", new Date()));
        personRepo.insert(new Person(5, "Burak", "Antalya", new Date()));

        // print results
        personRepo.findAll().forEach(System.out::println);

        /* find by id */
        System.out.println("\nFind By Id");
        Person person = personRepo.findById(5);
        System.out.println("Find Person => " + person);

        /* update */
        System.out.println("\nUpdate Example");
        person.setLocation("Malatya");
        personRepo.update(person);

        // print results
        personRepo.findAll().forEach(System.out::println);

        /* Find First */
        System.out.println("\nFind First By Name Ascending Order Example");
        System.out.println(personRepo.findFirstByNameAsc());

        /* Find By Name */
        System.out.println("\nFind By Name Example");
        personRepo.findByName("Emre").forEach(System.out::println);

        /* Find By Location */
        System.out.println("\nFind By Location Example");
        personRepo.findByLocation("Kayseri").forEach(System.out::println);

        /* delete */
        System.out.println("\nDelete Example");
        personRepo.delete(person.getId());

        // print results
        personRepo.findAll().forEach(System.out::println);
    }

}
