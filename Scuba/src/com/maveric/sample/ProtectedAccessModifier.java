package com.maveric.sample;

class Name {
    // protected method
    protected void display() {
        System.out.println("My Name is Vishal");
    }
}
class ProtectedAccessModifier extends Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an object of Dog class
		ProtectedAccessModifier Vishal = new ProtectedAccessModifier();
         // access protected method
		Vishal.display();
	}

}
