package com.example.SpringbootTest.DAO;

import com.example.SpringbootTest.Model.Person;

import java.util.List;
import java.util.Optional;

public interface personInterface {

    public void addName (Person person);

    public List<Person> getAll ();

    public Optional<Person> selectPersonByName (String name);

    public int deletePersonByName (String name);

}
