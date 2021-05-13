package com.youtube.learning;
class name
{
	int id;
	int number;
	static String value;
	
	//public name()
	//{
		//id = 1234;
		//number = 01234;
	//}
	
	static
	{
		value ="Exception redirected";
	}
	public void print()
	{
		System.out.println(+id+ ":"+number+": " +value);
	}
	
}
public class STATICDEMO2 
{
	public static void main(String[] args)
	{
		name obj = new name();
		obj.id = 1;
		obj.number = 10;
		
		name obj1 = new name();
	  obj1.id = 2;
	  obj1.number = 20;
		name obj2 = new name();
	obj2.id = 3;
	obj2.number = 30;
		
		obj.print();
		obj1.print();
		obj2.print();
		//System.out.println("id :"+obj.id+ " number :" +obj.number + " scale :"+obj.scale);
	}
}
//CONT FOR STATIC_DEMO.java
//19. Static Keyword - 01:56:41
