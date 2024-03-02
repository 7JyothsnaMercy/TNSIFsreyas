package day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C 
{

	void meth1()
	{
		System.out.println("implementing stream interface");
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(new A("mercy",20,500000));
		al.add(new A("shanthi",37,700000));
		al.add(new A("swajala",21,900000));
		System.out.println(al);
//		List<Object> updatedEmployees = al.stream()
//                .filter(employee -> al.getsAge() > 25)
//                .peek(employee -> employee.setsalary(employee.getsalary() * 1.1))
//                .sorted(Comparator.comparingDouble(al::getsalary))
//                .toList();
//
//        updatedEmployees.forEach(System.out::println);

//        updatedEmployees.forEach(System.out::println);
		
//		System.out.println(li);
		
//	   Stream<Object> s=al.stream().map(x->
//	   if(sAge>25)
//	   {
//		   return 
//	   }
//		   
//		);
		
	}
public static void main(String[] args)
{
	
new C().meth1();
}
}
