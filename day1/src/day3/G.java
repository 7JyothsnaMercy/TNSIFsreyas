/*finalize 00*/

package day3;

public class G 
{
	void meth1()
	{
		System.out.println("hi");
	}
	protected void finalize()
	 {
		 System.out.println("garbage has collected successfully");
	 }
public static void main(String[] args)
{ 

	 G obj1=new G();
	 G obj2=new G();
	 
	 obj1.meth1();
	 
	 obj1=null;
	 
	 //obj1.meth1();       ///it gives an Exception(NULL POINTER)
	
	 System.gc();           // it is a method to call garbage collector manually	 
	
	
}
}
