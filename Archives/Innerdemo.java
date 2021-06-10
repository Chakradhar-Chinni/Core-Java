package com.youtube.learning;

class Outer  //outer class
{
	public void show() //Method inside outer class 
	{         
	System.out.println("From Outer class 1.1");    
	} 
	 class Inner //class inside a class 
	{ 
		public void show1()
		{
			System.out.println("From Inner Class 1.2");
		}
	}
	 class newInner //class inside a class
	{
		 public void show2()
		 {
			 System.out.println("From newInner 1.3");
		 }
	 class subinner //subclass inside a class
	 {
		 public void display()
		 {
			 System.out.println("From subinner 1.3.1");
		 }
	 }
	}
}
public class Innerdemo 
{
	public static void main(String[] args)
	{
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.show1();
		
		Outer.newInner obj2 = obj.new newInner();
		obj2.show2();
		
		Outer.newInner.subinner obj3 = obj2.new subinner();
		obj3.display();
	} 
} 
//20. Inner  Class - 02:08:50
