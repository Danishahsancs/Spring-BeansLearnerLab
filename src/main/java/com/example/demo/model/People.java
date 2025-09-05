package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    public List<PersonType> personList;

    public People(PersonType... people) {
        this.personList = new ArrayList<>();
        for (PersonType p : people) {
            this.personList.add(p);
        }
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people) {
        for (PersonType person : people) {
            personList.add(person);
        }
    }

    public PersonType findById(long id) {
        PersonType temp = null;
        for (PersonType person : personList) {
            if (person.getId() == id) {
                temp = person;
            }
        }

        return temp;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
