package day2;

public class D27 {
	int meth1(int x, int y)
	{
	System.out.println("hi");
	return x+y;

	}
	void meth2(int i)
	{
		System.out.println(i+i);
	}
	public static void main(String[] args) {
	new D27().meth2(new D27().meth1(5, 95));
		
	}
	

}
