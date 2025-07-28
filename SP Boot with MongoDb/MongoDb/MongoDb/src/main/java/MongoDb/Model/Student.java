package MongoDb.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;

@Document(collection = "Student")
public class Student {
    private int id;
    private String Name;
    private String City;
    private String Collage;

    public Student(int id, String name, String city, String collage) {
        this.id = id;
        Name = name;
        City = city;
        Collage = collage;
    }
    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCollage() {
        return Collage;
    }

    public void setCollage(String collage) {
        Collage = collage;
    }
}
