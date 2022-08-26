package com.bgsw.rest;

import com.bgsw.model.Employee;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    List<Employee> empList= new ArrayList<>();

    @GetMapping("/employee")
    public List<Employee> getEmployee(){

       return empList;
    }

    @PostMapping("/employee")
    public Employee saveEmployee( @RequestBody Employee emp ){
             empList.add(emp);
        return emp;

    }
    @PutMapping("/employee")
    public String updateEmployee( @RequestBody Employee emp){

           if( empList.contains(emp)){
              int p= empList.indexOf(emp);
               empList.remove(p);
               empList.add(emp);
               return " Employee records updated ";
           }


            else
        return " employee not found with given id";
    }


    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable int empId){

       for(Employee e:empList){

           if(e.getEmpId()==empId){
               empList.remove(e);
               return " Employee deleted successfully" + empId;
           }

       }
       return " No employee found with given id"+ empId;
    }
}
