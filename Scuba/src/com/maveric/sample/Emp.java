package com.maveric.sample;

public class Emp {
	
	int eid;  //instance variable
	int salary;
	static String ceo; // static variable
	
	// static block
	static {
		ceo= "Dinesh";
		System.out.println("In static...");
	}
	
	//constructor
	
	public Emp() {
		eid=1;
		salary=60000;
		System.out.println("In constructor...");
	
	}
	
	//method
	public void show()
	{
		System.out.println(eid+ ":" + salary + ":" + ceo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //create 2 Emp objects Ramesh, Suresh
		Emp Ramesh=new Emp();  // constructor gets called
		Emp Suresh=new Emp();
		
		Ramesh.show();
		Suresh.show();
	}

}
