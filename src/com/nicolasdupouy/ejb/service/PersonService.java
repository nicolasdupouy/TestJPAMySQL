package com.nicolasdupouy.ejb.service;

import com.nicolasdupouy.entities.Person;

import java.util.List;

public interface PersonService {

    //public List<Person> listPersons();

    Person get(long id);

    void add(Person person);

    void delete(Person person);

}
