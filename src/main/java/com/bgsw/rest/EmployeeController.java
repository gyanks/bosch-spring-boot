package com.bgsw.rest;

import com.bgsw.model.Employee;
import com.bgsw.repo.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    //List<Employee> empList= new ArrayList<>();

    EmployeeDao empDao;
    @Autowired
    public EmployeeController(EmployeeDao empDao) {
        this.empDao = empDao;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee(){

     return  empDao.findAll();
    }

    @GetMapping("/employee/{empId}")
    public Employee getEmployeeById( @PathVariable Integer empId){
             return empDao.findById(empId).get();

    }
    @PostMapping("/employee")
    public Employee saveEmployee( @RequestBody Employee emp ){
            empDao.save(emp);
        return emp;

    }
    @PutMapping("/employee")
    public String updateEmployee( @RequestBody Employee emp){

          /* if( empList.contains(emp)){
              int p= empList.indexOf(emp);
               empList.remove(p);
               empList.add(emp);
               return " Employee records updated ";
           }*/

// if id exist then update otherwise it will save new record
         empDao.saveAndFlush(emp);
         return " Employee updated successfully";
    }


    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable int empId){

           empDao.deleteById(empId);
       return "  employee deleted  with given id"+ empId;
    }
}
