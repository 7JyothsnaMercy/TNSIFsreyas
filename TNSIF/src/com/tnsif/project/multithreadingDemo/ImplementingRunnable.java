package com.tnsif.project.multithreadingDemo;

//to demonstrate implementing runnable interface


public class ImplementingRunnable implements Runnable {
	public static void main(String[] args) {
		ImplementingRunnable r=new ImplementingRunnable();  //new state
		
		Thread t=new Thread(r);
		
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
		

	}

	@Override
	public void run() {
		System.out.println("hello java");
		
	}


}
