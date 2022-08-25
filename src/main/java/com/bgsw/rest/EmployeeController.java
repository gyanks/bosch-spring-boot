package com.bgsw.rest;

import com.bgsw.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public Employee getEmployee(){

        Employee emp = new Employee(1234,"Supriya",98765);
        return emp;
    }

}
