package com.maveric.sample;

public class AcessModifier2 {

	  private String firstname = "Vishal";
	  private String lastname = "Kate";
	  private String email = "vishalk@gmail.com";
	  private int age = 29;
	  
	  public static void main(String[] args) {
		  AcessModifier2 myObj = new AcessModifier2();
	    System.out.println("Name: " + myObj.firstname + " " + myObj.lastname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}
