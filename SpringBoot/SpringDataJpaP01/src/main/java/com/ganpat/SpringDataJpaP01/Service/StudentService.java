package com.ganpat.SpringDataJpaP01.Service;

import com.ganpat.SpringDataJpaP01.Entity.Student;
import com.ganpat.SpringDataJpaP01.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }



    public List<Student> fetchAlldata(){
        List<Student> all = studentRepo.findAll();
        return all;
    }

    public Student getdataById(int id){
        Optional<Student> byId = studentRepo.findById(id);
        Student student = byId.get();
        return student;
    }

    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }

    public Student updateStudent(Integer id, Student student) {

        Optional<Student> byId = studentRepo.findById(id);
        Student stud = null;

        if (byId.isPresent()){
            Student dbstudent = byId.get();

            dbstudent.setName(student.getName());
            dbstudent.setAge(student.getAge());
            dbstudent.setEmail(student.getEmail());

            stud = studentRepo.save(dbstudent);
        }else {
            System.out.println("Data is not present");
        }

        return stud;

    }
}
