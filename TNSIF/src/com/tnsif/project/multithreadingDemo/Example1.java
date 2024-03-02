package com.tnsif.project.multithreadingDemo;
//multithreading using static keyword:
//to demostarte synchronization

public class Example1 {
	synchronized static void display() {
		
		Thread g=Thread.currentThread();
		
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(g.getName() + " " + i);
				System.out.println("--------------");
			
			} catch (Exception e) {
				
			}
		}
	}
}
