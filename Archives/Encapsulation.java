package com.youtube.learning;
class emp
{
	int empid;
	String empname;
}

public class Encapsulation 
{
	public static void main(String[] args)
	{
		emp e1 = new emp();
		emp e2 = new emp();
		
		e1.empid = 1;
		e1.empname = "John";
		
		e2.empid = 2;
		e2.empname = "Thomas";
		
	}

}
