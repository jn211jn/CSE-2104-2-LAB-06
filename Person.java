/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author Shimi
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    
    public String getName(){
        return name;
    
    }
    public void setName(String name){
        this.name=name;
    
    }
    public int getAge(){
        return age;
    
    }
    public void setAge(int age){
        this.age=age;
     }
    public String getGender(){
        return gender;
    
    }
    public void setGender(String gender){
        this.gender=gender;
    
    }
    public String getAddress(){
        return address;
    
    }
    public void setAddress(String address){
        this.address=address;
    
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Shimi");
        person1.setAge(23);
        person1.setGender("Female");
        person1.setAddress("Shekertek");
        
        Person person2=new Person();
        person2.setName("Maisha");
        person2.setAge(22);
        person2.setGender("Female");
        person2.setAddress("Shekertek");
        
        Person person3=new Person();
        person3.setName("Akash bai");
        person3.setAge(25);
        person3.setGender("Male");
        person3.setAddress("Jatrabari");
        
        System.out.println("Person 1 : ");
        System.out.println("Name = "+person1.getName());
        System.out.println("Age = "+person1.getAge());
        System.out.println("Gender = "+person1.getGender());
        System.out.println("Address = "+person1.getAddress());
        System.out.println();
        
        System.out.println("Person 2 : ");
        System.out.println("Name = "+person2.getName());
        System.out.println("Age = "+person2.getAge());
        System.out.println("Gender = "+person2.getGender());
        System.out.println("Address = "+person2.getAddress());
        System.out.println();
        
        System.out.println("Person 3 : ");
        System.out.println("Name = "+person3.getName());
        System.out.println("Age = "+person3.getAge());
        System.out.println("Gender = "+person3.getGender());
        System.out.println("Address = "+person3.getAddress());
        
    }
}
