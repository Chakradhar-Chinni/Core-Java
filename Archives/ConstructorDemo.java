package com.youtube.learning;
class hustle
{
	public hustle()
	{
		System.out.println("Default Constructor");
	}
	public hustle(int i)
	{
		System.out.println("From Parameterised Constructor I int : "+i);
	}
	public hustle(int i,int j) 
	{
	  System.out.println("From Parameterised Constructor II int's : "+i+","+j);	
	}
	
}

public class ConstructorDemo 
{
	public static void main(String[] args)
	{
		hustle obj = new hustle(10,10);
		//System.out.println("Java");
		
	}

}

/*
1.Default Constructor               //Constructor donot have return type only method have return type
2.Parmeterised constructor 			//Constructor name is same as the class name
3.Constructor Overloading

Note:
Implicit Conversion:
if int is called without int body then it executes the body of double if available
but if double is called with out its body int cannot be executed though it's available
*/
