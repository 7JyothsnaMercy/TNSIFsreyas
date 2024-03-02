
package day1;

public class ClassB
{
	public void meth1()
	{
		System.out.println("meth1() called");
		ClassB bobj=new ClassB();
		bobj.meth2();
		
	}
	public void meth2()
	{
		System.out.println("meth2() called");
		
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		ClassB bobj=new ClassB();
		bobj.meth1();
		System.out.println("java is awesome");
		System.out.println("end");
		
	}
	

}
