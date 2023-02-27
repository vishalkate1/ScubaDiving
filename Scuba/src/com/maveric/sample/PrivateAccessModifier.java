package com.maveric.sample;

class Data {
    private String name;

    // getter method
    public String getName() 
    {
        return this.name;
    }
    // setter method
    public void setName(String name) 
    {
        this.name= name;
    }
}

public class PrivateAccessModifier 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  Data d = new Data();

	        // access the private variable using the getter and setter
	        d.setName("Vishal Kate");
	        System.out.println(d.getName());
	}

}
