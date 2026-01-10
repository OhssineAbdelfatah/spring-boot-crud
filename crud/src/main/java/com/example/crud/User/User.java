package com.example.crud.User;

import jakarta.persistence.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    private String name;

    private String email;


    /*Getters and Setters */

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name; 
    } 

    public void setEmail(String email){
        this.email = email;
    }

    public void setId(Long id){
        this.id = id;
    }

}