package com.maveric.sample;



class MyName{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="INDIRA"; 
	   //constructor  
	   MyName(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyName mn1 = new MyName(101,"Vishal");  
		MyName mn2 = new MyName(201,"Tushar");  
		 
		mn1.display();  
		mn2.display();  

	}

}
