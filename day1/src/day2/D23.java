package day2;

public class D23 
{
	void meth1(int x,int y) 
	{
		System.out.println("x:"+x);
		System.out.println(x+y);
		System.out.println("y:"+y);
		System.out.println(x*y);	
	}
	void meth2(String s)
	{
		new D23().meth1(5,10);
		System.out.println(s+ "awesome");
	}
	public static void main(String[] args) {
		System.out.println(10);
		D23 obj=new D23();
		System.out.println("hi");
		obj.meth2("java is");
	}

}
