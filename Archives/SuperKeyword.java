package com.youtube.learning;
class e1// super class
{
	public e1()  //default constructor
	{
	 System.out.println("Default class A || super-class");
	}
	public e1(int i) //Single Parameterized constructor
	{
		System.out.println("Single Parameterized constructor || super-class");
	}
}
class e2 extends e1 // sub class
{
	public e2() //Default Constructor
	{
		System.out.println("Default class B || sub-class");
	}
	public e2(int i) //Single Parameterized constructor
	{
		System.out.println("Single Parameterized constructor || sub-class");
	}
}


public class SuperKeyword 
{
	public static void main(String[] args)
	{
		e2 obj = new e2();
	}

}
/*
Default constructor of Super Class will be called for sure to avoid this functionality we use "super" keyword and this is mentioned
in the particular sub-class with signature
*/

/*
In Method over-riding we use the annotation @Override to override super-class method from sub-class without any errors
 without mentioning the annotation also it works but if the method name matches for both the classes it results to
 logical error if the annotation is mentioned then is just results to compilation error.
*/