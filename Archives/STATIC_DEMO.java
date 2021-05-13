package com.youtube.learning;
class Abc
{
	static int i;
	public static void show()
	{ 
		System.out.println(Abc.i);
		System.out.println("hi from do() method");
	}
}

public class STATIC_DEMO 
{
	public static void main(String[] args)
	{
		Abc.i = 5;
		Abc.show(); 
	}

}

/*
 in static method there is no need to create an object for a class
 variables can also be static
 a non-static variable cannot exist in a static method
 19. Static Keyword - 01:56:41 cont on STATICDEMO2.java
 */
