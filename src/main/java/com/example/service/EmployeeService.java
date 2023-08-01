package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.EmployeeRepository;
import com.example.domain.Employee;

@Service
@Transactional
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  public List<Employee> showList() {
    List<Employee> employeeList = employeeRepository.findAll();
    return employeeList;
  }

  public Employee showDetail(Integer id) {
    Employee employee = employeeRepository.load(id);
    return employee;
  }
}
