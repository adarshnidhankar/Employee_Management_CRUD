package com.Spring_Rest.Employee_Management_RestApp.Controller;

import com.Spring_Rest.Employee_Management_RestApp.Domain.Employee;
import com.Spring_Rest.Employee_Management_RestApp.Service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee_Controller {
    @Autowired
    private Employee_Service employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/addEmp")
    public void addEmploye(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmp/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id){
        employeeService.updateEmployee(employee,id);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
