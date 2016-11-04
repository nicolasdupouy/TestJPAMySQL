package com.nicolasdupouy.ejb.service.impl;

import com.nicolasdupouy.entities.Person;
import com.nicolasdupouy.ejb.service.PersonService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PersonServiceImpl implements PersonService {

    //@PersistenceContext(name = "java:/jdbc/birthdayReminderDatabase") //
    @PersistenceContext(name = "birthdayReminderPersistenceUnit")
    private EntityManager entityManager;

    /*@Override
    public List<Person> listPersons() {
        entityManager.findA
    }*/

    @Override
    public Person get(long id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public void add(Person person) {
        entityManager.persist(person);
    }

    @Override
    public void delete(Person person) {
        entityManager.remove(person);
    }
}
