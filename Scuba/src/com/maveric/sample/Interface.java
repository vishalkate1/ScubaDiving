package com.maveric.sample;

interface Drawable
{  
void draw();  
}  
 
class Square implements Drawable
{  
    public void draw()
    {
	  System.out.println("drawing Square");
	}  
}  
class Circle implements Drawable
{  
    public void draw()
    {
	  System.out.println("drawing circle");
	}  
}  

public class Interface 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Drawable d=new Circle();
		d.draw();  

	}

}
