package com.ganpat.RESTAPI.service.Impl;

import com.ganpat.RESTAPI.dto.Person;
import com.ganpat.RESTAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    Person amit = new Person("Amit","Jamui","M",20,"B-tech");
    Person harish = new Person("Harish B","Namakkal","M",21,"BE");
    Person abhinav = new Person("Abhinav","Patna","M",24,"MCA");
    Person heena = new Person("Henna","Chapra","F",20,"MBA");
    Person dipanjali = new Person("Dipanjali","rohtash","F",20,"BED");

    List<Person> personList = new ArrayList<>();
    @Override
    public List<Person> getAllPersonData() {
        personList.add(amit);
        personList.add(harish);
        personList.add(abhinav);
        personList.add(heena);
        personList.add(dipanjali);

        return personList;
    }


    @Value("${User.Gender}")
    String UserGender;
    @Override
    public List<Person> FilterDataBasedOnGen(List<Person> personList) {
       List<Person> people = new ArrayList<>();
        for (Person obj: personList) {
            if(!UserGender.equalsIgnoreCase(obj.getGender())){
                people.add(obj);
            }

        }

        return people;
    }
}
