package day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class classA
{
private static final boolean Integer = false;
void meth1()
{
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(60);
	al.add(70);
	al.add(80);
	al.add(90);
	al.add(10);
	al.add(20);
	al.add(30);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println();
//	ArrayList<Integer> un=new ArrayList<Integer>();
	System.out.println("removing duplicates elements from arraylist : ");
//    for(Integer i:un)
//    {
//    	if(!un.contains(al))
//    	{
//    		un.add(al);
//    	}
//    }
    Set<Integer> hs=new HashSet<Integer>(
    		);
    System.out.println(al);
	
}
public static void main(String[] args)
{
	new classA().meth1();
}
}
