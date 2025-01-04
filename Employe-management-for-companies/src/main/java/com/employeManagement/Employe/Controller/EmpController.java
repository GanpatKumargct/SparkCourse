package com.employeManagement.Employe.Controller;

import com.employeManagement.Employe.Entity.Employee;
import com.employeManagement.Employe.Service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
  @Autowired
    private EmployeeService employeeService;

    //insert Controller
    @PostMapping("/save")
    public Employee createEmploye(@RequestBody Employee employee){
        return employeeService.saveEmploye(employee);
    }

    @GetMapping("/Alldata")
    public List<Employee> fetchAllData(){
      return employeeService.fetchAllData();
    }

    @GetMapping("/FetchByID")
    public Employee fetchById(@RequestParam int id){
      return employeeService.fecthdatabyid(id);
    }

    @PostMapping("/delete")
    public void deleteByid(@RequestParam int id){
      employeeService.DeleteEmploye(id);
    }

    @PutMapping("/{id}")
    public Employee updatebyId(@PathVariable Integer id, @RequestBody Employee employee){
      Employee employee1 = employeeService.updateDataByID(id, employee);
      return employee1;

    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){

      return (CsrfToken) request.getAttribute("_csrf");
    }
}
