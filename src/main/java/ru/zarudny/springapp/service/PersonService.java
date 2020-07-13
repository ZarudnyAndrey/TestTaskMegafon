package ru.zarudny.springapp.service;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zarudny.springapp.entity.Person;
import ru.zarudny.springapp.repository.PersonRepository;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public Person getPerson(int personId) {
    return personRepository.getById(personId)
        .orElseThrow(EntityNotFoundException::new);
  }
}
