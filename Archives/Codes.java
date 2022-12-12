/*Class & Object
package com.java.series;
import java.util.Scanner;
class B
{
	int a,b;
	public void perform()
	{
		System.out.println(a+b);
	}
}
class C
{
	int c1,c2;
	public void execute()
	{
		System.out.println(c1-c2);
	}
}
public class Main
{
	public static void main(String[] args)
	{
		B obj = new B();
		C obj1 = new C();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a & b values");
		obj.a = sc.nextInt();
		obj.b = sc.nextInt();
		obj1.c1 = 1000;
		obj1.c2 = 1;
		obj.perform();
		obj1.execute();
	}

}
////////////////////////////
*/
/*Constructor & Constructor loading
* Constructors shouldn't have return type
* Constructors are invoke implicitly
* Java Compiler provides a default constructor if no constrcutor is present in class
package com.java.series;
class Calc
{
	public Calc()
	{
		System.out.println("From Default Constructor");
	}
	public Calc(int n)
	{
		System.out.println("From 1-int Parameter Constructor");
	}
	public Calc(int n,int a)
	{
		System.out.println("From 2-int Parameter Constructor");
	}
	public Calc(double d)
	{
		System.out.println("From 1-Double Constructor");
	}
}
public class A 
{
	public static void main(String[] args)
	{
		Calc obj = new Calc(9.8);
	}

}*/
* Java don't have copy constructor, still we can copy values of a constructor to another constructor (just like copy constructor in c++)
	
/*
this keyword
package com.java.series;
class Calc
{
	int num1,num2;
	public Calc(int num1,int num2)
	{
		this.num1=num1;  //this is used to indicate a variable as Global Variable
		this.num2=num2;
	}
}
public class A 
{
	public static void main(String[] args)
	{
		Calc obj = new Calc(9,8);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}*/
	
package com.src.github.java;
class A{
	int num1=3,num2;
	public void calc(int input1, int input2) {
		this.num1=input1+10;
		this.num2=input2;
		System.out.println(num1+num2);
		System.out.println(input1+" "+input2);
	}
}
public class Main 
{
	public static void main(String[] args)         
	{
		A obj1 = new A();
		obj1.calc(2,15);
	}
}

/*//Method overloading
package com.java.series;
class Calc
{
	int num1,num2;
	public void Calc(int num1)   //it can have class name or any name as it is a method
	{
		System.out.println("1");
	}
	public void Calc(int num1,int num2)
	{
		System.out.println("2");
	}
}
public class A 
{
	public static void main(String[] args)
	{
		Calc obj = new Calc();
		obj.Calc(1,10);
		
	}

}*/

/*Static block with constructor overloading
package org.geeksforgeeks;  //constructor loading.java

import org.geeksforgeeks.emp;

class emp
{
	int id;
	String name;
	int exp;
	static String category;
	static 
	{
	  category = "Developer";	
	}
	public emp()//Default COnstructor
	{
		System.out.println("Default COnstructor");
	}
	public emp(int id,String name) //Experience Constructor
	{
		//System.out.println("id: "+id +"\n"+ "Name: "+name +"\n" +"category: "+category);
		System.out.println(id+"\t"+name+"\t"+category+"\t"+exp);
	}
	public emp(int id,String name,int exp)
	{
		//System.out.println("id: "+id+"\n"+"name: "+"+name"+"\n"+"category: "+category + "Exp:"+exp);
		System.out.println(id+"\t"+name+"\t"+category+"\t"+exp);
	}
}
public class CO1 //Constructor loading-1 
{
	public static void main(String[] args)
	{
		System.out.println("Id"+"\t"+"Name"+"\t"+"Category"+"\t"+"Exp");
		emp kumar = new emp(1863,"Kumar");
		emp ravi  = new emp(1864,"ravi",2);
		emp vikranth = new emp();
	}
}
*/

/*Inner Class
package com.java.series;//static block with constructor loading

import com.java.series.Outer.Inner;

class Outer
{
	public void per()
	{
		System.out.println("From Outer Class");
	}
	class Inner
	{
		public void perf()
		{
			System.out.println("From Inner Class");
		}
	}
}
public class A 
{
	public static void main(String[] args)
	{
		Outer obj = new Outer(); //outer class
		Outer.Inner obj1 = obj.new Inner(); //inner class
		obj1.perf();
		
	}
}
*/
/*
2d-array
package com.java.series;//static block with constructor loading
public class A 
{
	public static void main(String[] args)
	{
		int arr[][] = {
					   {1,2,3,4},
					   {5,6,7,8}
					};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
			  System.out.println(" "+ arr[i][j]);
			}
			System.out.println();
		}
	}
}
*/

/* Varargs
 package com.java.series;
class outer
{
	public int view(int ... n)
	{
		int sum=0;
		for(int i : n)
		{
			sum=sum+i;	
		}
		return sum;
	}
}
public class A 
{
	public static void main(String[] args)
	{
	    outer obj = new outer();
	    System.out.println(obj.view(1,2,1,1,1,1,1,1));
	}
}

//line 4 : (int ... n) these three dots accept multiple arguments instead of writing int n1,int n2,....
//line 7 : for(int i : n) this is a enhanced for loop
 */
//Single-level inheritance
/*
	package com.java.series;
class one
{
	public void display()
	{
		System.out.println("From class one");
	}
}
class two extends one
{
	public void view()
	{
		System.out.println("From class two");
	}
}
public class A 
{
	public static void main(String[] args)
	{
		two obj = new two();
		obj.view();
		obj.display();
	}
}
//Inheritance reduces Redundancy i.e. decreases lines of code
//sub class exhibits all the properties of super class
//super-class/parent-class/base-class
//sub-class/child-class/derived-class	
*/
/* Multi-level inheritance
package com.java.series;
class one
{
	public void display()
	{
		System.out.println("From class one");
	}
}
class two extends one
{
	public void view()
	{
		System.out.println("From class two");
	}
}
class three extends two
{
	public void show()
	{
		System.out.println("From class three");
	}
}
public class A 
{
	public static void main(String[] args)
	{
		three obj = new three();
		obj.view();
		obj.display();
		obj.show();
	}
}
//Inheritance reduces Redundancy i.e. decreases lines of code
//sub class exhibits all the properties of super class
//super-class/parent-class/base-class
//sub-class/child-class/derived-class



//Multi-level inheritance
 * package com.java.series;
class one
{
	public void display()
	{
		System.out.println("From class one");
	}
}
class two extends one
{
	public void view()
	{
		System.out.println("From class two");
	}
}
class three extends two
{
	public void show()
	{
		System.out.println("From class three");
	}
}
public class A 
{
	public static void main(String[] args)
	{
		three obj = new three();
		obj.view();
		obj.display();
		obj.show();
	}
}
//Single level inheritance means the child class is derived from parent class
//Multi-level inheritance means the child class inherits the derived class
//Multiple inheritance means the child class inherits many parent classes
*/

/*
Super Keyword
package com.java.series;
class one
{
	public one()
	{
		System.out.println("one");
	}
	public one(int i)
	{
		System.out.println("one+1");
	}
}
class two extends one
{
	public two()
	{
		super(12);
		System.out.println("two");
	}
	public two(int i)
	{
		System.out.println("two+1");
	}
}
public class A 
{
	public static void main(String[] args)
	{
		//one obj = new one(1);
		two obj1 = new two();
	}
}

/*
Inheritance in Constructors
After inheriting a class, though we create an object for inherited class, the default constructor of parent 
class will be called but if we use a parameterized constructor to call a constructor from inherited class,
then that specific constructor along with default constructor of parent class will be called.

To call specific constructor from inherited class, every time default constructor of parent class will be 
called, though we donot require it, to come this we use SUPER keyword. 

By default every parent/child class will have super method which calls only default constructor of its
parent class 

/*
Method overriding
package com.java.series;
class one
{
	public void one()
	{
		System.out.println("one");
	}
}
class two extends one
{
	@Override
	public void one()
	{
		System.out.println("two");
	}
}

public class A 
{
	public static void main(String[] args)
	{
		two obj = new two();
		obj.one();
	}
}

/*
To ride a method the class must be inherited from the parent class
the method name in inhertied class and parent class must be same
mention @Override on the riding method  
*/ 
/*
Encapsulation in Java
package com.java.series;
class one
{
	private int a,b;

	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public int getB() 
	{
		return b;
	}
	public void setB(int b) 
	{
		this.b = b;
	}	
}
public class A 
{
	public static void main(String[] args)
	{
		one obj = new one();
		obj.setA(10);
		System.out.println(obj.getA());
	}
}

Encapsulation is used to hide the data by making the variables to private and these variables are assigned values using getters & setters
From Main class we assign the values to the private variables using setter method and retrieve the data using getter method
Encapsulation binds the data along with the methods, here the actual implementation is hidden to the user
*/
/*
ParseInt
package com.java.series;
public class A 
{
	public static void main(String[] args)
	{
		String str = "1234";
		int i = Integer.parseInt(str);
		System.out.println(i+2);
	}
}
*/
/* Wrapper Class
 package com.java.series;
public class A 
{
	public static void main(String[] args)
	{
		int i=5;//int i -> Primitive method 
		
		Integer ii = new Integer(i);  //boxing-wrapping
		int j = ii.intValue();  //unboxing-wrapping
		
		Integer value = i; //auto-boxing
		int k = value; // auto-unboxing
		
	}
}

/*
 Wrapper Classes are slow compared to primitive data types, the reason to use wrapper class is few frame works of java like Hibernate donot
 support primitive data types.
 In Wrapper classes we use data types by creating an object of their actual class. normal or auto any method can be used
 
 to use int data type we have created an object for Integer class, similarly for using char type we have to create an object of char class 
 
*/
/*
 Abstraction in Java
abstract class, abstract method
Abstract Class
 abstract class one
{
	public void m1()
	{
		System.out.println("From m1() class");
	}
	public void m2()
	{
		System.out.println("From m2() class");
	}
}
class two extends one
{
	public void m1()
	{
		System.out.println("From m3() class");
	}
	public void m4()
	{
		System.out.println("From m4() class");
	}
}
public class A
{
	public static void main(String[] args)
	{
		//one obj = new two();   //Reference of class one & object of class two [if a same method is present in ref & obj class then
											methods of object class gets called]
		two obj = new two();	//reference & object of class two
		obj.m1();
		obj.m2();
	}
}
---------------
Abstract Method (Method can be abstract iff class is also abstract)
public abstract void m1()
	{
		System.out.println("From m1() class");
	}
Notes:
__--Abstraction--__
 object cannot be created for abstract class, but with the reference of abstract class a object can be created for its base class
 To access the methods from abstract class refer above point
 class and method can be marked as abstract
 Method can be abstract iff class is also abstract class
 When a class is abstract its base class is referred to as concrete class.
 */
/*
Final 
final class,final method, final variable 

final class
final class cannot be extended by any other class but it can be instantiated (object can be created)
final class one
{
	public void m1()
	{
		System.out.println("m1 from one class");
	}
}
public class A
{
	public static void main(String[] args)
	{
		one obj = new one();
		obj.m1();
	}
}

final method
class one
{
	public final void m1()
	{
		System.out.println("m1 from one class");
	}
}
Final method cannot be overridden but can be overloaded
final method cannot be over-ridden by its own class or base class

final variable
final int a=10;
Value of final variable cannot be changed (it can be treated as constant)
*/

/* Interface
 * Normal Interface
 package com.java.series;
interface numbers
{
	void print();
}
class one implements numbers
{
	public void print()
	{
		System.out.println("One");
	}
}
class two implements numbers
{
	public void print()
	{
		System.out.println("Two");
		System.out.println("Super");
	}
}
public class A
{
	public static void main(String[] args)
	{
		numbers obj = new two();
		obj.print();
	}
}

// Methods cannot be defined in Interface
// By default interface methods will be abstract
// An object cannnot be instantiated for interface but using the reference of interface we create objects for its base class
*/
/*
Anonymous Inner Class
class one 
{
	public void show()
	{
		System.out.println("From Class One");
	}
}

public class A
{
	public static void main(String[] args)
	{
		one obj = new one() {
			public void show()
			{
				System.out.println("From Class One !!");
			}
		};
		obj.show();
	}
}
*/

/*
Anonymous class with interface
package com.java.series;
interface one 
{
	void show();
}

public class A
{
	public static void main(String[] args)
	{
		one obj = new one() {
			public void show()
			{
				System.out.println("From Class One !!");
			}
		};
		obj.show();
	}
}
*/
/*
 Functional Interface - Lambda Expression
 @FunctionalInterface
interface one 
{
	void show();
}

public class A
{
	public static void main(String[] args)
	{
		one obj = () -> System.out.println("From interface");
		obj.show();
	}
}
 As we use only a single method in functional interface, we directly write a print line in object instantiation itself. 
*/

/*
 * Default method in Interface
 * package com.java.series;

interface one 
{
	void show();
	default void display() //From Java 1.8
	{
		System.out.println("From display");
	}
}
class two implements one
{
	public void show()
	{
		System.out.println("From show");
	}
}

public class A
{
	public static void main(String[] args)
	{
		one obj = new two();
		obj.display();
		obj.show();
	}
}

//As, methods can be declared but cannot be defined in interface, but from java 1.8 version we can declare methods in interface which is not allowed in java 1.7
// however an object for interface cannot be created in 1.8 also
//to define a method in interface syntaxt would be " default void m1() "
// the methods in interface can be accessed and over-ridden by creating an object of its base class with reference of its interface class 
 //the above defined interface can be a @functionalinterface as it has only 1 abstract method
 //functional interface means it must have only 1 abstract method,the above has only 1 abstract method(void show), and it has (default void display)
  which is a default method and this default method cannot be considered as a abstract method

 */

/*
Super with Interfaces

interface one 
{
	default void show()
	{
		System.out.println("From one");
	}
}
interface two 
{
	default void show()
	{
		System.out.println("From two");
	}
}
class three implements one,two
{
	public void abc()
	{
		int a;
	}
	public void show()
	{
		one.super.show();
		two.super.show();//super.show() is actually used but as it is implementing two interfaces we mention the interface name i.e. one.super.show()    
	}
}

public class A
{
	public static void main(String[] args)
	{
			one obj = new three();
			obj.show();
	}
}
*/
/*
 //Try catch -- Exception Handling

public class A 
{
	public static void main(String[] args)
	{
			
		try
		{
			int i=9/0;
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println("Exception Error");
		}
		System.out.println("Bye");
	}
}
// To handle exceptions, we use try and catch blocks, critical statements are written in try block and if exception occurs that exception is 
// thrown to cath block with object of 'Exception e'
 */
/*
 package com.java.series;
// Multiple Catch Blocks -- Exception Handling
public class A 
{
	public static void main(String[] args)
	{
			
		try
		{
			int a[] = new int[5];
			a[6]=10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexException Error");
		}
		catch(Exception e)
		{
			System.out.println("Default Exception Block");
		}
		finally
		{
			System.out.println("Bye");
		}
	}
}

/*
  For a try block, multiple catch blocks can be written the default 'Exception' class is the super class of ArrayIndex,NullPointer,Arithmetic ..
  for all the exceptions it is the super class, Exceptions can be written specifically such as Arithmetic,Array,Null to get specific message
  when a error is occured
  If we are not sure about which Exception may arise then, Exception e can be mentioned, but if we use Exception e then it must be written on
  the last catch block. 
*/
 
 
 //StringBuffer & StringBuilder can be used to achieve mutuability in a string [Always Prefer StringBuffer than StringBuilder]
