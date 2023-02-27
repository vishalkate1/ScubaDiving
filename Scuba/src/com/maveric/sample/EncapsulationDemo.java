package com.maveric.sample;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student();
        Student s2=new Student();
        s1.setRollno(200);
        System.out.println(s1.getRollno());
	}

}

class Student{
	
	int rollno;
	String name;
	
	public void setRollno (int r)
	{
		rollno=r;
	}
	public int getRollno() {
		return rollno;
	}
}