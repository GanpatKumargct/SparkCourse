package MongoDb.Controller;

import MongoDb.Model.Student;
import MongoDb.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/save")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student save = this.studentRepo.save(student);
        return ResponseEntity.ok(save);

    }

    @GetMapping("/fetch")
    public ResponseEntity<?> getStudent(){
        List<Student> all = this.studentRepo.findAll();
        return ResponseEntity.ok(all);
    }
}
