package com.ganpat.RESTAPI.controller;

import com.ganpat.RESTAPI.dto.Person;
import com.ganpat.RESTAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api")
public class TinderController {

    @Autowired
    PersonService  personService;


    //Pervious method ---- to getting all the data
  /*  @GetMapping("/getPersons")
    public List<Person> getAllPerson(){
        return personService.getAllPersonData();
    }*/


    //New method ---- to filter based on gender data
    @GetMapping("/getPersons")
    public List<Person> getAllPerson(){
        List<Person> allPersonData = personService.getAllPersonData();
        List<Person> people = personService.FilterDataBasedOnGen(allPersonData);

        return people;
    }



    @PostMapping("/CreateUser")
    public Person CreateUser(@RequestBody Person person){
        System.out.println("Data Inserted successfully\nHere is your data : ");
        return person;
    }
}
