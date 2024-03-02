package day2;

public class D26 
{
	int meth1()
	{
	System.out.println("meth1");
	return 50;
	}
	public static void main(String[] args) {
		
		System.out.println("hello world");
		D26 obj=new D26();
		int x=obj.meth1();
		System.out.println(x+new D26().meth1());
	}


}
