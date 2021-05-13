package com.youtube.learning;
class Casio
{
	public void add(int i,int j)
	{
		int r = i+j;
		System.out.println("Sum of 2 Variables is :"+r);
	}
	public void add(int i,int j,int k)
	{
		int r = i+j+k;
		System.out.println("Sum of 3 variables is : "+r);
	}
	public void mul(int i,int j)
	{
		int r = i*j;
		System.out.println("Product of 2 variables from obj1 : "+r);
	}
}

public class MethodandConstructor_overloading 
{
	public static void main(String[] args)
	{
		Casio obj = new Casio();
		Casio obj1 = new Casio();  //encapsulation
		obj1.mul(10,1);
		obj.add(10,20);
		obj.add(10, 20,40);
	}

}
//18. Method and Constructor Overloading - 01:51:29