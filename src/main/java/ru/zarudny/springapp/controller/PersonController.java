package ru.zarudny.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.zarudny.springapp.entity.Person;
import ru.zarudny.springapp.service.PersonService;

@RestController
@RequestMapping("api/person")
public class PersonController {

  @Autowired
  private PersonService personService;

  @GetMapping("/{personId}")
  @ResponseStatus(HttpStatus.OK)
  public Person getPerson(@PathVariable int personId) {
    return personService.getPerson(personId);
  }
}
