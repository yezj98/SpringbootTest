package com.example.SpringbootTest.DAO;

import com.example.SpringbootTest.DAO.personInterface;
import com.example.SpringbootTest.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("personAPI")
public class personDAO implements personInterface {
    List <Person> listPerson = new ArrayList<Person>();

    @Override
    public void addName(Person person) {
        listPerson.add(new Person(person.getAge(),person.getName()));
    }

    @Override
    public List<Person> getAll() {
        return listPerson;
    }

    @Override
    public Optional<Person> selectPersonByName(String name) {
        return listPerson.stream().filter(person -> person.getName().equals(name)).findFirst();
    }

    @Override
    public int deletePersonByName(String name) {
        Optional<Person> selectedPerson = selectPersonByName(name);
        if (listPerson.isEmpty()){
            return 0;
        }
        System.out.println(selectedPerson.get());
        listPerson.remove(selectedPerson.get());
        return 1;
    }

}
