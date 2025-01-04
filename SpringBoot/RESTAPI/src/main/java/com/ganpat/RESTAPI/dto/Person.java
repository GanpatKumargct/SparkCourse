package com.ganpat.RESTAPI.dto;

public class Person {
    private String Name;
    private String City;
    private String Gender;
    private int age;
    private String Education;

    public Person(String name, String city, String gender, int age, String education) {
        Name = name;
        City = city;
        Gender = gender;
        this.age = age;
        Education = education;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", City='").append(City).append('\'');
        sb.append(", Gender='").append(Gender).append('\'');
        sb.append(", age=").append(age);
        sb.append(", Education='").append(Education).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
