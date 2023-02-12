package ru.philimonov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.philimonov.springcourse.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);

    List<Person> findByNameOrderByAge(String name);

    List<Person> findByEmail(String startingWith);

    List<Person> findByNameOrEmail(String name, String email);

}