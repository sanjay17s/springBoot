package com.example.springboot.revison.service;

import com.example.springboot.revison.dao.PersonDao;
import com.example.springboot.revison.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
