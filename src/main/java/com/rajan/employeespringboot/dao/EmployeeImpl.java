package com.rajan.employeespringboot.dao;


import com.rajan.employeespringboot.model.Employee;
import com.rajan.employeespringboot.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImpl implements EmployeeRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployees() {
        String sql = "SELECT * FROM employee";
        List<Employee> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Employee.class));
        return list;
    }

    @Override
    public Employee getEmployee(int emp_no) {
        String sql = "SELECT * FROM employee WHERE emp_no = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] {emp_no}, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public Integer saveEmployee(Employee employee) {
        String sql = "INSERT INTO  employee(first_name,last_name) VALUES(?,?)";
        return jdbcTemplate.update(sql,new Object[]{employee.getFirst_name(),employee.getLast_name()});
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET first_name = ?, last_name = ? WHERE emp_no = ?";
        return jdbcTemplate.update(sql, new Object[] {employee.getFirst_name(), employee.getLast_name(),employee.getEmp_no()});
    }

    @Override
    public Integer deleteEmployee(int emp_no) {
        String sql = "DELETE FROM employee WHERE emp_no = ?";
        return jdbcTemplate.update(sql, new Object[]{emp_no});
    }


}
