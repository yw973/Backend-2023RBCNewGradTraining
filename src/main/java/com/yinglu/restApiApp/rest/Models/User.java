package com.yinglu.restApiApp.rest.Models;

import jakarta.persistence.*;

@Entity // this user class will be a table in the database
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column
    private int age;
    @Column
    private String occupation;

    public User(){

    }

    public User(String firstName, String lastName, Long id, Integer age, String occupation ){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }


    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }


    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }


    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
