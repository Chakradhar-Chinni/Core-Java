package com.youtube.learning;
class calca
{
	int n1,n2,result;
	public void add()
	{
		result = n1+n2;
		System.out.println("from var.add() : "+ result);
	}
	public void sub()
	{
		result = n1-n2;
		System.out.println("from var.sub() : "+ result);
	}
	public void mul()
	{
		result = n1*n2;
		System.out.println("from var.mul() : "+ result);
	}
	public void div()
	{
		result = n1/n2;
		System.out.println("from var.div() : "+ result);
	}
}
public class Arithmetic 
{
	public static void main(String[] args)
	{
			calca var = new calca();
			var.n1 = 20;
			var.n2 = 20;
			var.add();
			var.sub();
			var.mul();
			var.div();		
	}
}
