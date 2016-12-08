package pl.akademiakodu.dao;

import pl.akademiakodu.model.Person;

import java.util.List;


public interface PersonDao {
    void save(Person user);

    List<Person> getAll();

    List<Person> findByLastname(String lastname);

    void deleteById(Long id);

    Person find(Long id);


}





