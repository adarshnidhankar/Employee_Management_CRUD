package com.Spring_Rest.Employee_Management_RestApp.Service;

import com.Spring_Rest.Employee_Management_RestApp.Domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Employee_Service {
    private final List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee(101, "adarsh", "devloper", 30500.44));
    }

    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employee, int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            if (e.getEmpId() == id) {
                employeeList.set(i, employee);
            }
        }
    }

    public void deleteEmployee(int id) {
        Employee emp = null;
        for (Employee employee : employeeList) {
            if (employee.getEmpId() == id) {
                emp = employee;
            }
        }
        employeeList.remove(emp);
    }
}
