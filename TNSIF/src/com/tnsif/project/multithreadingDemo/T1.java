package com.tnsif.project.multithreadingDemo;

public class T1 extends Thread{
	Example e;

	//T(Example e){
//		this.e=e;
	//}
	public void run() {
		Example1.display();
	}
}
