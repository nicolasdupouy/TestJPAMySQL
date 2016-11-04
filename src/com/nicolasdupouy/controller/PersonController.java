package com.nicolasdupouy.controller;

import com.nicolasdupouy.ejb.service.PersonService;
import com.nicolasdupouy.entities.Person;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;

@ManagedBean
public class PersonController {

    private Person person = new Person();

    @EJB
    private PersonService service;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void savePerson(Person person) {
        service.add(person);
    }
}
