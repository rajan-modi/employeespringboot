package com.rajan.employeespringboot.repository;

import com.rajan.employeespringboot.model.Employee;

import  java.util.List;
import java.util.Map;

public interface EmployeeRepo {
    public List<Employee> getEmployees();
    public Employee getEmployee(int emp_no);
    public Integer saveEmployee(Employee employee);
    public Integer updateEmployee(Employee employee);
    public Integer deleteEmployee(int emp_no);
    public List<Map<String, Object>> getCombinedEmployees();
    public List<Map<String, Object>> getCombinedEmployeesById(int emp_no);
}
