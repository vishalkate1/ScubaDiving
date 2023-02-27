package com.maveric.sample;

class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
           
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }
}

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8; 
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }

	}

}

