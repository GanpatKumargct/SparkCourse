package com.ganpat.RESTAPI.service;

import com.ganpat.RESTAPI.dto.Person;

import java.util.List;


public interface PersonService {

   List<Person> getAllPersonData();

   List<Person> FilterDataBasedOnGen(List<Person> personList);

}
