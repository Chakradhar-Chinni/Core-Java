import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		//System.out.println("Hello World");
		ArrayList <String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("E");
		l.add("R");
		l.add("C");
		l.add("D");
    
    System.out.println(l);
    
	}
}


/* ===================
      Iterator
   =================== */

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		//System.out.println("Hello World");
		ArrayList <String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("E");
		l.add("R");
		l.add("C");
		l.add("D");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
		    System.out.println(itr.next()+"9");
		}
	}
}
