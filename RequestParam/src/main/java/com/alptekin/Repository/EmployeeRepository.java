package com.alptekin.Repository;


import com.alptekin.Enitity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeRepository {

    ArrayList<Employee> EmployeeList = new ArrayList<>();

    public EmployeeRepository(){
        EmployeeList.add(new Employee("12", "John Snow", 25, 32000L, "Night Shift"));
        EmployeeList.add(new Employee("24", "Tyrion Lannister", 38, 34000L, "Night Shift"));
        EmployeeList.add(new Employee("42", "Arya Stark", 14, 1000L, "Night Shift"));
        EmployeeList.add(new Employee("16", "Cersei Lannister", 42, 10L, "Day Shift"));
        EmployeeList.add(new Employee("9", "Sandor Clegane (The Hound)", 32, 9000L, "Night Shift"));
        EmployeeList.add(new Employee("18", "Jaime Lannister", 41, 10L, "Day Shift"));
        EmployeeList.add(new Employee("21", "Petyr Baelish", 45, 1L, "Day Shift"));
        EmployeeList.add(new Employee("14", "Brienne of Tarth", 32, 15000L, "Night Shift"));
        EmployeeList.add(new Employee("18", "Stanis", 41, 21000L, "Night Shift"));
    }

    public ArrayList<Employee> getEmployeeWithParams (String FullName, String id, String Shift){

        ArrayList<Employee> getEmployee = new ArrayList<>();

        if (id != null) {
            for (Employee employee : EmployeeList) {
                if (employee.getId().equals(id)) {
                    getEmployee.add(employee);
                }
            }
        }
        else if (FullName != null && Shift != null) {
            for (Employee employee : EmployeeList) {
                if (employee.getShift().equals(Shift) && employee.getFullName().equals(FullName)){
                    getEmployee.add(employee);

                }
            }
        }
        else if (Shift != null) {
            for (Employee employee : EmployeeList) {
                if (employee.getShift().equals(Shift)){
                    getEmployee.add(employee);
                }
            }
        }
        else {
            for (Employee employee : EmployeeList) {
                if (employee.getFullName().equals(FullName)){
                    getEmployee.add(employee);
                }
            }
        }

        return getEmployee;
    }


}
