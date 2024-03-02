package day1;

public class A
{
	String sName;
	 int sAge;
	 double salary;
	 public A(String sName,int sAge,double salary)
	 {
		 this.sName=sName;
		 this.sAge=sAge;
		 this.salary=salary;
	 }
	 public String getsName()
	    {
	        return sName;
	    }

	    public int getsAge()
	    {
	        return sAge;
	    }

	    public double getsalary() 
	    {
	        return salary;
	    }
	    public void setSalary(double salary) 
	    {
	        this.salary = salary;
	    }

	 @Override
	 public String toString()
	 {
		 return sName+ " " + sAge+" "+salary;
	 }
}
