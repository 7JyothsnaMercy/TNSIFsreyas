package day3;

import java.util.ArrayList;
import java.util.Iterator;


public class A 
{
public void meth1()
{
	System.out.println("implementing ArrayList");
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
//	al.add("java");
//	al.add("megha");
//	al.add("teju");
//	al.add("prasanna");
//	al.add("teju");
	al.add(50);
	System.out.println(al);
	System.out.println("size(): " +al.size());
	System.out.println(al.get(1));
	System.out.println("get(): "+al.get(al.size()-2));
	System.out.println("get(): "+al.get(al.size()-5));
	System.out.println("\n");
	System.out.println("********************");
	System.out.println("\n");
	System.out.println("using for loop");
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i)+" ");
	}
	System.out.println("\n");
	System.out.println("using for each loop");
	for(Object o:al)
	{
		System.out.println(o+" ");
	}
	System.out.println("using iterator interface");
	Iterator<Object> i=al.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

//	al.clear();

//	System.out.println(al);

	System.out.println(al.isEmpty());

	System.out.println(al.contains(20));
	System.out.println(al.remove(4));
	System.out.println(al);
     }
	
public static void main(String[] args)
{
	new A().meth1();
}
}
