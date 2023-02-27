package com.maveric.sample;

class Schools{  
void School_1(){
	System.out.println("Primary:1st to 4th standards class");
	}  
}  
class Standards extends Schools{  
void School_2(){
	System.out.println("Secondary:5th to 10th standards class");
	}  
}  

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Standards s=new Standards();  
		s.School_1();  
		s.School_2();  
	}

}
