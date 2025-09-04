package main.java.com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    protected List<PersonType> personList;

    protected People(PersonType... people) {
        this.personList = new ArrayList<>();
        for (PersonType p : people) {
            this.personList.add(p);
        }
    }

    protected void add(PersonType person) {
        personList.add(person);
    }

    protected void remove(PersonType person) {
        personList.remove(person);
    }

    protected int size() {
        return personList.size();
    }

    protected void clear() {
        personList.clear();
    }

    protected void addAll(Iterable<PersonType> people) {
        for (PersonType person : people) {
            personList.add(person);
        }
    }

    protected PersonType findById(long id) {
        PersonType temp = null;
        for (PersonType person : personList) {
            if (person.getId() == id) {
                temp = person;
            }
        }

        return temp;
    }

    protected List<PersonType> findAll() {
        return personList;
    }
}
