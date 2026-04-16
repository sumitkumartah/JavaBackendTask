package org.Code;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int empid;

    private String name;
    private String dept;

    // Getters & Setters
    public int getEmpid() { return empid; }
    public void setEmpid(int empid) { this.empid = empid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    @Override
    public String toString() {
        return empid + " " + name + " " + dept;
    }
}