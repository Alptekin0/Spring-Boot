package com.alptekin.Controller;

import com.alptekin.Enitity.Employee;
import com.alptekin.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/Employee")
public class RestEmployeeController {

    private EmployeeService employeeService;

    public RestEmployeeController (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/GetEmployeeParams")
    public ArrayList<Employee> getEmployeeWithParams (@RequestParam(name = "FullName", required = false) String FullName,
                                                      @RequestParam (name = "id", required = false) String id,
                                                      @RequestParam (name = "shift", required = false) String Shift)
    {
        return employeeService.getEmployeeWithParams(FullName, id, Shift);
    }

    // RequestParam url üzerinden gelen parametreleri almak için kullanılan bir anatasyondur.
    // Bir listedeki birden fazla değişkeni alıp onlara göre listeleme yapılabilir.
    // @RequestParam (name = "Salary") String Salary şeklinde kullanılır.
    // Url ise http://localhost:8080/Employee/GetEmployeeParams?Name=Mehmet şeklinde olur
    // Url'de soru işareti varsa muhtemelen request param değişkeni ile eşleşir. RequesParam Name'i ile url'deki bire bir eşleşmelidir.


}

