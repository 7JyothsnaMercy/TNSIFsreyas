package day3;

public class test2 implements Runnable
{
public void run()
{
	System.out.println("test");
	
}
public static void main(String args) 
{
	test2 obj=new test2();
	Thread t=new Thread();
	t.start();
	
	
}
}
