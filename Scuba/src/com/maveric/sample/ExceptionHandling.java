package com.maveric.sample;

public class ExceptionHandling 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10;
	      int b=0;
	        try
	        {
	          System.out.println(a/b);
	        }
	        catch(ArithmeticException e)
	        {
	    	  System.out.println(e);
	    	  System.out.println("Something went wrong.");
	        }

	}

}


