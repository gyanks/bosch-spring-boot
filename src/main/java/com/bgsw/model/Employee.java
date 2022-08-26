package com.bgsw.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    private int empId;
    private String empName;
    private double salary;


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp= (Employee) obj;
       if(this.empId==emp.empId)
           return true;
       else
           return false;
    }

}
