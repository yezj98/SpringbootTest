package com.example.SpringbootTest.API;

import com.example.SpringbootTest.Model.Person;
import com.example.SpringbootTest.Service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequestMapping ("api/test")
@RestController
public class personApi {
    private final personService personService;

    @Autowired
    public personApi(com.example.SpringbootTest.Service.personService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addName (@RequestBody Person person){
        personService.addName(person);
    }

    @GetMapping
    public List<Person> getAll(){
        return personService.getAll();
    }

    @GetMapping (path = "{name}")
    public Person selectPersonByName (@PathVariable ("name") String name) {
        return personService.selectPersonByName(name).orElse(null);
    }

    @DeleteMapping (path = "{name}")
    public int deletePersonByName (@PathVariable ("name") String name){
        return personService.deletePersonByName(name);
    }
}