/*   getClass():   */

package day3;

public class E
{
	void meth1()
	{
		System.out.println("hi");
	}
 
 public static void main(String[] args) 
 {
	 E obj1=new E();
	 E obj2=new E();
	 System.out.println("getClass:" +obj1.getClass());
	 System.out.println("getClass:" +obj2.getClass());
	obj1.meth1();
}
}
