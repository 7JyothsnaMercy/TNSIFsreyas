package day2;

public class D2A 
	{
		String meth1(int a,int b)
		{
			System.out.println(10);
			System.out.println((54+a)-b);
			int value=new D2A().meth5();
			System.out.println(value);
			return "java";
			
		}
	    int meth2(int a)
	    {
	    	System.out.println(75);
	    	int b=5;
	    	System.out.println(b-a);
	    	return((5*5)-b);
	    }
	    void meth3()
	    {
	    	System.out.println("start");
	    	System.out.println(new D2A().meth4());
	    	System.out.println(40);
	    }
	    String meth4()
	    {
	    	System.out.println("today is wednesday");
	    	return new D2A().meth1(4,8);
	    	
	    }
	    int meth5()
	    {
	    	D2A obj=new D2A();
	    	System.out.println(99);
	    	return obj.meth2(5);
	    }
	    public static void main(String[] args) {
			D2A obj=new D2A();
			obj.meth3();
		}
}



