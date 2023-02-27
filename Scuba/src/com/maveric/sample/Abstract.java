package com.maveric.sample;

abstract class Shape
{  
abstract void draw();  
}  
 
class Rectangle extends Shape{  
void draw()
{
	System.out.println("drawing Square");}  
}  
class Triangle extends Shape{  
void draw()
{
	System.out.println("drawing Triangle");}  
}  

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Triangle(); 
		s.draw();  
	}

}
