package pl.akademiakodu.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.akademiakodu.model.Person;

import javax.persistence.Query;
import java.util.List;


@Repository
public class PersonDaolmpl extends GenericDao<Person> implements PersonDao {

    @Override
    @Transactional
    public List<Person> getAll() {
        Query query = entityManager.createQuery("SELECT p FROM Person p");
        return query.getResultList();
    }

    @Override
    @Transactional
    public List<Person> findByLastname(String lastName) {
        Query query = entityManager.createQuery("SELECT p FROM Person p WHERE p.lastName='"+ lastName+ "'");
        return query.getResultList();
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Person person = entityManager.find(Person.class, id);
        entityManager.remove(person);
    }

    @Override
    @Transactional
    public Person find(Long id) {
        return entityManager.find(Person.class,id);
    }
}
