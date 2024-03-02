/* boolean equals():*/

package day3;

public class D
{
		void meth1()
		{
			System.out.println("hi");
			
		}
		public static void main(String[] args)
		{
			D obj1=new D();
			D obj2=new D();
	
	
	    System.out.println(obj1.equals(obj2));
	    System.out.println(obj1.equals(obj1));
	    System.out.println(obj2.equals(obj1));
	    System.out.println(obj2.equals(obj2));
	    System.out.println(new D().equals(new D()));
	    System.out.println(obj1.equals(obj2));
		}
}

	    
