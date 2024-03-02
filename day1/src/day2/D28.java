package day2;

public class D28
{
	void meth1()
	{	
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
		
		
	}
	int meth2(int a,int b,int c)
	{
	System.out.println(a);
	D28 obj=new D28();
	String s=obj.meth5(100,"java is awesome");
	System.out.println(s);
	return a-b;
		
	}
	String meth3(String s,int b,int d)
	{
		System.out.println(b+d);
		return s;
		
	}
	int meth4(int c,int k)
	{
		D28 obj=new D28();
		int result=obj.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
		
	}
	String meth5(int a,String l)
	{
		System.out.println(a+a);
		D28 obj=new D28();
		String s=obj.meth3("hi", 15, 10);
		System.out.println(s);
	return l;
	
		
	}
	public static void main(String[] args)
	{
		D28 obj=new D28();
		System.out.println("START");
		int result=obj.meth4(20,10);
		System.out.println(result);
		obj.meth1();
		
		
	}

}
