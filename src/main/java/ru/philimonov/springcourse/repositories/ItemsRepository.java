package ru.philimonov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.philimonov.springcourse.models.Item;
import ru.philimonov.springcourse.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findBYItemName(String itemName);

    List<Item> findByOwner(Person owner);
}
