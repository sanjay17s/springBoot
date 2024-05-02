package com.example.springboot.revison.dao;

import com.example.springboot.revison.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDbDao implements PersonDao{

   List<Person> DB = new ArrayList<>();

   @Override
    public int insertPerson(UUID id, Person person) {
       DB.add(new Person(id, person.getName()));
        return 1;
    }
}
