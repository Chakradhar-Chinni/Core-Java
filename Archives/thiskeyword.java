package com.youtube.learning;
class refthis
{
	int a,b,r;
	public refthis(int a,int b)
	{
		this.a = a; //'this' is used to represent global variable 
		this.b = b;	//'this' is used to represent global variable
		
	}
}

public class thiskeyword 
{
	public static void main(String[] args)
	{
		refthis obj = new refthis(10,20); //2 parameterised constructor
		
		System.out.println(obj.a+","+obj.b);
	}

}
/*
 when instance and local variables have the same name we specify 'this.' to the instance variables
 instance variables (Global Variablles) 
 17. This keyword - 01:47:52
*/