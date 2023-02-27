package com.maveric.sample;


public class StaticMethod 
{
	
	 static int addition(int x)
	 {  
		  return x+x;  
	 }  

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int result=StaticMethod.addition(10);  
		  System.out.println(result);  
	}

}
