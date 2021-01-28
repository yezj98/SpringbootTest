package com.example.SpringbootTest.Service;

import com.example.SpringbootTest.DAO.personInterface;
import com.example.SpringbootTest.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class personService {

    private final personInterface personInterface;

    @Autowired
    public personService(@Qualifier ("personAPI") com.example.SpringbootTest.DAO.personInterface personInterface) {
        this.personInterface = personInterface;
    }

    public void addName (Person person){
        personInterface.addName(person);
    }

    public List<Person> getAll() {
       return personInterface.getAll();
    }

    public Optional<Person> selectPersonByName (String name){
        return personInterface.selectPersonByName(name);
    }

    public int deletePersonByName (String name){
        return personInterface.deletePersonByName(name);
    }

}
