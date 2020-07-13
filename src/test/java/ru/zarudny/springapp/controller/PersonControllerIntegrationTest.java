package ru.zarudny.springapp.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.zarudny.springapp.entity.Person;
import ru.zarudny.springapp.utils.IntegrationTest;

@IntegrationTest
public class PersonControllerIntegrationTest {

  @Autowired
  TestRestTemplate testRestTemplate;

  @Test
  void getPerson_resultOk() {
    Person person = Person.builder()
        .id(1)
        .firstName("Johannes")
        .lastName("Gutenberg")
        .age(50)
        .build();

    HttpEntity<String> entity = new HttpEntity<>("body", null);
    ResponseEntity<Person> response = testRestTemplate
        .exchange("/api/person/1", HttpMethod.GET, entity, Person.class);

    Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    Assertions.assertEquals(person, response.getBody());
  }

  @Test
  void getPerson_withInvalidId_resultBadRequest() {
    HttpEntity<String> entity = new HttpEntity<>("body", null);
    ResponseEntity<Person> response = testRestTemplate
        .exchange("/api/person/10", HttpMethod.GET, entity, Person.class);

    Assertions.assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
  }
}
