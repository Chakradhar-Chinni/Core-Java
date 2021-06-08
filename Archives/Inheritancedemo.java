package com.youtube.learning; 
class A //super class
{
	public A() 
	{ 
		System.out.println("Default Constructor");  
	} 
	public A(int a)
	{ 
		System.out.println("super class Parameterized constructor");
	}
}
class B extends A //sub-class
{
	public B()
	{
		super(5);
		System.out.println("Class B");
	}
}
public class Inheritancedemo 
{
	public static void main(String[] args)
	{
		B e = new B();
		
	}

}
/*
 Default constructor will be called for sure to avoid this functionality we use "super" keyword and this is mentioned
 in the particular sub-class with signature
*/
