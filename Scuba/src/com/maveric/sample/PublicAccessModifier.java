package com.maveric.sample;

class UserName
  {
  // public variable
  public String firstname;

  // public method
  public void display() 
  {
      System.out.println("Vishal Rohidas Kate");
      System.out.println("My firstname is : " + firstname );
  }
}

public class PublicAccessModifier {

	public static void main(String[] args) {
		
		
		UserName name = new UserName();

      // accessing the public variable
		name.firstname = "Vishal";
      // accessing the public method
		name.display();
	}

}
