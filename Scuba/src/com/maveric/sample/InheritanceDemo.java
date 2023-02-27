package com.maveric.sample;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		SubClassB obj = new SubClassB();
		obj.foo();
		obj.bar();
		
		
	}

}

class SuperClassA {
	public void foo() {
		System.out.println("Its super class A");
		
	}
}

class SubClass extends SuperClassA {
	  public void bar() {
		  System.out.println("Its sub class B");
	  }
}