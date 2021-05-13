package com.youtube.learning;

class apple
{
	public void display()
	{
		System.out.println("in A");
	}
}
class fruit extends apple
{
	@Override
	public void display()
	{
		
		System.out.println("in B");
	}
}
class fruits extends fruit
{
//	@Override
	public void display()
	{
		System.out.println("in named method of class B");
	}
}
public class DynamicMethodDispatch 
{
	public static void main(String[] args)
	{
		 apple obj = new fruit();
		 //obj = new fruits(); //creating object of class fruits with reference of class fruit
		 obj.display();
	}

}
