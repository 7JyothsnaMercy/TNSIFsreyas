

/* hash code problem*/

package day3;

public class C
{
	void meth1()
	{
		System.out.println("hi");
		
	}
	public static void main(String[] args) {
		C obj1=new C();
		C obj2=new C();
		int x=obj1.hashCode();
		int y=obj2.hashCode();
	System.out.println("obj1 hashcode():"+x);
    System.out.println("obj2 hashcode():"+y);
   
	}
	


}
