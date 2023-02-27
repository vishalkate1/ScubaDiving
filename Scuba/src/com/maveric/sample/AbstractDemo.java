package com.maveric.sample;

abstract class Aphone
{
	public void call()
	{
		System.out.println("calling...");
	}
//these are abstract methods	
	public abstract void music();
	public abstract void camera();
	public abstract void storage();
}

abstract class Bphone extends Aphone
{
	public void music()
	{
		System.out.println("Music...");
	}
}

class Cphone extends Bphone
{
	public void camera()
	{
		System.out.println("camera...");
	}
	
	public void storage()
	{
		System.out.println("Storage...");
	}
}

public class AbstractDemo {
	
public static void main(String[] args) {
	
	Cphone phone=new Cphone();
	
	phone.storage();
	phone.call();
	phone.music();
	
	phone.camera();
	
}

}
