package com.youtube.learning;
//Creating I class
class exp
{
	int id;
	static String dept;
    String name;
	public void student()
	{
		System.out.println(+id+":"+name+":"+dept);
	}
	static
	{
		dept = "CSE";
	}
	
}
//Creating II class
class fac
{
	int id;
	String name;
	int salary;
	static String dept;
	public void info()
	{
		System.out.println(+id+":"+name+":"+salary+":"+dept);
	}
	static
	{
		dept = "CSE";
	}
}
public class Staticexp 
{
	public static void main(String[] args)
	{
		
	  //Data about class exp
		//creating objects of class fac
		exp s1 = new exp();
		exp s2 = new exp();
		s1.id = 1;
		//s1.dept = "CSE";
		s1.name = "Student1";
		
		s2.id = 2;
		//s2.dept = "CSE";
		s2.name = "Student2";
		s1.student();
		s2.student();
	 //Data about class fac
		//creating objects of class fac
		fac e1 = new fac();
		fac e2 = new fac();
		
		e1.id = 01;
		e1.name = "Fac1";
		e1.salary = 999999;
		e1.info();
		
		done obj = new done();
		obj.donedisplay();
	}
}
class done
{
	int id;
	String url;
	public void donedisplay()
	{
		System.out.println(+id+":"+url);
	}
	public done()
	{
		id = 12345;
		url = "www.google.com";
	}
}
