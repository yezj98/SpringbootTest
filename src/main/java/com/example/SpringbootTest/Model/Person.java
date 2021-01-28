package com.example.SpringbootTest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    final int age;
    final String name;

    public Person(@JsonProperty ("age") int age,@JsonProperty ("name") String name) {
        this.age = age;
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public int getAge (){
        return age;
    }


}
