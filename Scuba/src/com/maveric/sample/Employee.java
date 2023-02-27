package com.maveric.sample;

public class Employee //Default Access Modifier
{
	  String emp_fname = "Vishal";
	  String emp_lname= "Kate";
	  String email = "vishalk@gmail.com";
	  int age = 29;
	  
	  public static void main(String[] args) 
	  {
	    Employee myObj = new Employee();
	    System.out.println("Name: " + myObj.emp_fname + " " + myObj.emp_lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
}

