package com.ganpat.SpringDataJpaP01.Controller;

import com.ganpat.SpringDataJpaP01.Entity.Student;
import com.ganpat.SpringDataJpaP01.Service.StudentService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/std")
public class StudentController {
 @Autowired
    private StudentService service;



    //Insert Student
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    //Fetch All the Data
    @GetMapping("/FetchAllData")
    public List<Student> getAllData(){
        return service.fetchAlldata();
    }

    //fetch data by id
   /* @GetMapping("/{id}")
    public Student getDataById(@PathVariable int id){
        return service.getdataById(id);
    }*/

    @GetMapping("id")
    public Student getDataById(@RequestParam int id){
        return service.getdataById(id);
    }

    @PostMapping("delete")
    public void deleteStudent(@RequestParam int id){
        service.deleteStudentById(id);
    }


    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student){
        Student updatedStudent = service.updateStudent(id, student);
        return updatedStudent;
    }

}
