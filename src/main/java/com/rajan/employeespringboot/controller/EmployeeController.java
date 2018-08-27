package com.rajan.employeespringboot.controller;

import com.rajan.employeespringboot.dao.EmployeeImpl;
import com.rajan.employeespringboot.model.Employee;
import com.rajan.employeespringboot.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeImpl employeeimpl;

    @RequestMapping(value = "/employees")               //Get all employees
    public List<Employee> getEmployees(){
        return employeeimpl.getEmployees();
    }

    @RequestMapping(value = "/employee/{emp_no}")       //Get employee by Emp_no
    public Employee getEmployee(@PathVariable Integer emp_no){
        return employeeimpl.getEmployee(emp_no);
    }

    @PostMapping(value = "/employee")                   //Insert Operation
    public String saveEmployee(@RequestBody Employee employee){
        Integer res =  employeeimpl.saveEmployee(employee);
        if(res == 1)
            return "Record inserted successfully";
        else
            return "Record not inserted";
    }

    @PutMapping(value = "/employee")
    public String updateEmployee(@RequestBody Employee employee){
        Integer res = employeeimpl.updateEmployee(employee);
        if(res == 1)
            return "Record updated successfully";
        else
            return "Record not updated";
    }

    @DeleteMapping(value = "employee/{emp_no}")
    public String deleteEmployee(@PathVariable int emp_no){
        Integer res = employeeimpl.deleteEmployee(emp_no);
        if(res == 1)
            return "Record deleted successfully";
        else
            return "Record not deleted";
    }
}
