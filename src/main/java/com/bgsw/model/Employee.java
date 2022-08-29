package com.bgsw.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee  {

    @Id
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
