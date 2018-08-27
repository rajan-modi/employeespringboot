package com.rajan.employeespringboot.repository;

import com.rajan.employeespringboot.model.Employee;

import  java.util.List;

public interface EmployeeRepo {
    public List<Employee> getEmployees();
    public Employee getEmployee(int emp_no);
    public Integer saveEmployee(Employee employee);
    public Integer updateEmployee(Employee employee);
    public Integer deleteEmployee(int emp_no);
}
