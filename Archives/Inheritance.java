package com.youtube.learning; 
class v1
{ 
	public int add(int a1,int a2)  
	{      
		return a1+a2;   
	}    
}
class v2 extends v1
{
	public int sub(int s1,int s2)
	{
		return s1-s2;
	}
	public int mul(int m1,int m2)
	{
		//int r = m1*m2;
		//System.out.println("Multiplication Executes");
		return m1*m2;
	}
}
class v3 extends v2
{
	public int div(int d1,int d2)
	{
		return d1/d2;
	}
}

public class Inheritance 
{
	public static void main(String[] args)
	{
		v3 obj = new v3();
		System.out.println("Sum : "+obj.add(4,4));
		System.out.println("Sub : "+obj.sub(12,2));
		//obj.mul(2,6);
		System.out.println("Mul : "+obj.mul(2,6));
		System.out.println("Div : "+obj.div(28, 2));
	}

}
