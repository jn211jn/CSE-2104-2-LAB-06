/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author Shimi
 */
public class Employee {
    private String name;
    private int id;
    private float salary;
    private String designation;
    
    public String getName(){
        return name;
    
    }
    public void setName(String name){
        this.name=name;
    
    }
    public int getId(){
        return id;
    
    }
    public void setId(int id){
        this.id=id;
     }
    public float getSalary(){
        return salary;
    
    }
    public void setSalary(float salary){
        this.salary=salary;
    
    }
    public String getDesignation(){
        return designation;
    
    }
    public void setDesignation (String designation){
        this.designation=designation;
    
    }

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setName("Shimi");
        employee1.setId(21011);
        employee1.setSalary(65000);
        employee1.setDesignation("HR");
        
        Employee employee2=new Employee();
        employee2.setName("Maisha");
        employee2.setId(21012);
        employee2.setSalary(66000);
        employee2.setDesignation("HR");
        
        Employee employee3=new Employee();
        employee3.setName("Akash bai");
        employee3.setId(21013);
        employee3.setSalary(50000);
        employee3.setDesignation("Manager");
        
        System.out.println("Employee 1 : ");
        System.out.println("Name = "+employee1.getName());
        System.out.println("Age = "+employee1.getId());
        System.out.println("Gender = "+employee1.getSalary());
        System.out.println("Address = "+employee1.getDesignation());
        System.out.println();
        
        System.out.println("Employee 2 : ");
        System.out.println("Name = "+employee2.getName());
        System.out.println("Age = "+employee2.getId());
        System.out.println("Gender = "+employee2.getSalary());
        System.out.println("Address = "+employee2.getDesignation());
        System.out.println();
        
        System.out.println("Employee 3 : ");
        System.out.println("Name = "+employee3.getName());
        System.out.println("Age = "+employee3.getId());
        System.out.println("Gender = "+employee3.getSalary());
        System.out.println("Address = "+employee3.getDesignation());
        
    }
}

