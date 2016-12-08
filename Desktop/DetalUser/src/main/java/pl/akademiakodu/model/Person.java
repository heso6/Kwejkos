package pl.akademiakodu.model;

import javax.persistence.*;


@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // public Person(String janek, String python){}

    private String firstName;
    private String lastName;

    public Person(){}


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {return getFirstName()+" "+ getLastName();}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}