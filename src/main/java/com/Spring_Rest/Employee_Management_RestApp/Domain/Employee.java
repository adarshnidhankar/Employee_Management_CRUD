package com.Spring_Rest.Employee_Management_RestApp.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private int empId;
    private String empName;
    private String empDesig;
    private double empSalary;
}
