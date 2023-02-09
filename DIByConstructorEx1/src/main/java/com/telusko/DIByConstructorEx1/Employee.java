package com.telusko.DIByConstructorEx1;

public class Employee 
{
   private int id;
   private String name;
   
   public Employee()
   {
	   System.out.println("Default Constructor");
   }
   
   public Employee(int id)
   {
	   this.id = id;
   }
   public Employee(String name)
   {
	   this.name = name;
   }
   public Employee(int id, String name)
   {
	   this.id = id;
	   this.name = name;
   }

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
   
}
