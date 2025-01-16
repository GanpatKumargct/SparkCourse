package com.ganpat.SpringDataJpaP01.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "students")
public class Student {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Email;
    private int Age;


    public Student( String name, String email, int age) {
        Name = name;
        Email = email;
        Age = age;
    }

    public Student() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("Id=").append(Id);
        sb.append(", Name='").append(Name).append('\'');
        sb.append(", Email='").append(Email).append('\'');
        sb.append(", Age=").append(Age);
        sb.append('}');
        return sb.toString();
    }
}
