package dta.example.h2dbmemory;

import dta.example.h2dbmemory.data.Person;
import dta.example.h2dbmemory.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@RequestMapping(value = "", produces = "application/json")
public class H2DbMemoryApplication {

    @Autowired
    private PersonRep personRep;


    public static void main(String[] args) {
        SpringApplication.run(H2DbMemoryApplication.class, args);
    }

    @RequestMapping("create-person")
    public Person createPerson() {
        return personRep.save(new Person());
    }

    @RequestMapping("persons")
    public ArrayList getList() {
        return (ArrayList) personRep.findAll();
    }

}
