package day2;

public class D22
{
	void meth1()
	{
		System.out.println("hi");
		
	}
	void meth2()
	{
		System.out.println("hello");
	}
      public static void main(String[] args)
      {
		
	    D22 obj=new D22();
	    obj.meth1();
	    obj.meth2();
	    System.out.println("-----");
	    new D22().meth1();
	    new D22().meth2();

      }
}
