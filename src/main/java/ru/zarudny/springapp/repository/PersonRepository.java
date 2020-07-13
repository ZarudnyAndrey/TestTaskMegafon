package ru.zarudny.springapp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.zarudny.springapp.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>,
    JpaSpecificationExecutor<Person> {

  Optional<Person> getById(int id);
}
