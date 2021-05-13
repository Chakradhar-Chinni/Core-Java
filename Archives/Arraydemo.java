package com.youtube.learning;

public class Arraydemo 
{
	public static void main(String[] args)
	{
		//int a[] = {10,20,30,40,50};
		
		int a[] = new int[4];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		//a[4] = 4;
		
		for(int i=0 ;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
