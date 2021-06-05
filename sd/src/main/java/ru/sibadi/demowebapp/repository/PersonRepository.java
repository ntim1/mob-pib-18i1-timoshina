package ru.sibadi.demowebapp.repository;

import org.springframework.stereotype.Repository;
import ru.sibadi.demowebapp.domain.Person;

import java.util.List;

@Repository
public class PersonRepository {

    private final List<Person> persons = List.of(
            new Person(1001, "Рик", 30_000),
            new Person(1002, "Смит", 120_000),
            new Person(1003, "Панерн", 500_000),
            new Person(1004, "Фулстак", 205_000)
    );

    public List<Person> findAllPersons() {
        return persons;
    }

    public Person findPersonById(int id) {
        Person foundPerson = null;
        for (Person p : persons) {
            if (p.getId() == id) {
                foundPerson = p;
            }
        }
        return foundPerson;
    }
}
