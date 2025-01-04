package com.employeManagement.Employe.Service;

import com.employeManagement.Employe.Entity.Employee;
import com.employeManagement.Employe.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    //save employe into db
    public Employee saveEmploye(Employee employee){

        return employeeRepo.save(employee);

    }



    //Fetch All Data
    public List<Employee> fetchAllData(){
        List<Employee> all = employeeRepo
                .findAll();
        return all;
    }

    //Fetch Employe by id
    public Employee fecthdatabyid(int id){
        Optional<Employee> byId = employeeRepo.findById(id);
        Employee emp = byId.get();

        return emp;
    }

    //Delete Employe by id
    public void DeleteEmploye(int id){
        employeeRepo.deleteById(id);
    }

    //Update Employee By id
    public Employee updateDataByID(Integer id, Employee employee){
        Optional<Employee> byId = employeeRepo.findById(id);
        Employee emp = null;

        if(byId.isPresent()){
            Employee dbemp = byId.get();


            dbemp.setName(employee.getName());
            dbemp.setEmail(employee.getEmail());
            dbemp.setPassword(employee.getPassword());
            dbemp.setPosition(employee.getPosition());
            dbemp.setDepartment(employee.getDepartment());

            emp = employeeRepo.save(dbemp);
        }else{
            System.out.println("Data is not Present");
        }


        return emp;
    }


    /*public Employee Login(String Email, String Password){
//        Employee emp = employeeRepo.findByEmail();
//
//        if(!Objects.isNull(emp)){
//            return "Success";
//        }else{
//            return "failure";
//        }

        return "fv";
    }*/

}
