package com.employeManagement.Employe.Controller;

import com.employeManagement.Employe.Entity.Employee;
import com.employeManagement.Employe.Repo.EmployeeRepo;
import com.employeManagement.Employe.Service.EmployeeService;
import org.aspectj.weaver.ast.Var;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class UserController {

    private final EmployeeService employeeService;
    private EmployeeRepo employeeRepo;

    public UserController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/register")
    public Employee register(@RequestBody Employee employee){
        return employeeService.saveEmploye(employee);
    }

    @GetMapping("/data")
    public List<Employee> data(){
        return employeeService.fetchAllData();
    }

    /*@PostMapping("/login")
    public String Login(@RequestBody Employee employee){
        return "dfd";
    }*/
}
