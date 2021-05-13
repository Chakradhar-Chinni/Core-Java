package com.youtube.learning;
class run
{
	public int perform(int i,int j)
	{
		return i+j;
	}
}

public class Returndemo 
{
	public static void main(String[] args)
	{
		run obj = new run();
		 int a = obj.perform(4, 5);
		System.out.println(obj.perform(4,5));
		//System.out.println(a);
		
	}
}
