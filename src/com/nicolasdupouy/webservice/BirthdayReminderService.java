package com.nicolasdupouy.webservice;

import com.nicolasdupouy.ejb.service.PersonService;
import com.nicolasdupouy.entities.Person;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("person") //"birthdayreminder")
public class BirthdayReminderService {

    @Inject
    private PersonService personService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Person person) {
        personService.add(person);
    }

    @GET
    @Path("{id}/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") long id) {
        return personService.get(id);
    }

    @PUT
    @Path("{id}/delete")
    public void deletePerson(@PathParam("id") long id) {
        personService.delete(getPerson(id));
    }
}
