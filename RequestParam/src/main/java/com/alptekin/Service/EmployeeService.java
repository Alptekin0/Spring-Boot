package com.alptekin.Service;


import com.alptekin.Enitity.Employee;
import com.alptekin.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ArrayList<Employee> getEmployeeWithParams (String FullName, String id, String Shift) {
        return employeeRepository.getEmployeeWithParams(FullName, id, Shift);
    }

}
