package day2;

public class D21 
{
	
		void meth1(int a)
		{
			System.out.println("meth1() called");
			System.out.println("a");
			System.out.println("a value is:"+a);
			System.out.println('a');
			System.out.println(a-10);
			
		}
	      public static void main(String[] args)
	      {
			System.out.println("start");
		    D21 obj=new D21();
		    obj.meth1(100);
			System.out.println("end");
	    	  
		}


}
