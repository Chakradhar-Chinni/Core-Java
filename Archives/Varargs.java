package com.youtube.learning;
class royal
{
	public void s1(int ... n) //to accept multiple values from main method with out specifying input args we can specify 3 dots ... 
	{
		int sum = 0; 
		for(int i : n) //for-each or enhanced for loop (here both normal & enhanced for loop can be used)
		{
			sum = sum+i;  
		}
		System.out.println(sum);
	}
}
public class Varargs 
{
	public static void main(String[] args)
	{
		royal obj = new royal();
		obj.s1(10,20,30,40,50,60,70);
	}

}
//24. Varargs - 02:39:02  
