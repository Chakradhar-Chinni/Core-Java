//adding elements using add method into Integer Generic
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);// adds element at end of list
        al.add(30);
        System.out.print(al); 
    }
}
Output: [10, 20, 30]
//=======================

//adding elements using add method into String Generic
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");// adds element at end of list
        al.add("C");
        System.out.print(al);
    }
}
Output: [A, B, C]
//=======================

// adding elements at specific Index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);// adds element at end of list
        al.add(1,100);
        System.out.print(al);
    }
}
Output: [10, 100, 20, 30]
//=======================

// adding elements at specific Index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C"); // adds element at end of list
        al.add(0,"Z");
        System.out.print(al);
    }
}
Output: [Z, A, B, C]
//=======================
//joining two arraylists
//to join two arraylists they must be of same type i.e. generic must be same
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        System.out.println(al1);
        
        al2.add(100);
        al2.add(200);
        System.out.println(al2);
        
        al1.addAll(al2);
        System.out.print(al1);
    }
}
Output:
[10, 20]
[100, 200]
[10, 20, 100, 200]
//======================

//joining two arraylists based on index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        
        al2.add(100);
        al2.add(200);
        
        al1.addAll(1,al2);
        System.out.print(al1); 
    }
}
Output: 10 100 200 20
  
//======================
    
//Removing all elements from arraylist
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        
        al1.add(10);
        al1.add(20);
        al1.add(50);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);
        al1.clear();
        System.out.println(al1);
    }
}
Output:
[10, 20, 50, 30,40]
[]

//======================
    
//fetching element using index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(50);
        System.out.println(al1.get(0));
    }
}
Output: 10
//======================

//checking if arraylist is empty or not | returns true if arraylist is empty else false
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(50);
        System.out.println(al1.isEmpty());
    }
}
Output: false

//======================

//finding index of last occurence of element | returns -1 if element is not present
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(50);
        al1.add(20);
        al1.add(98);
        al1.add(87);
        System.out.println(al1.lastIndexOf(20));
        System.out.println(al1.lastIndexOf(93));
    }
}
Output: 
3  // element 20 last occured at index 3
-1  // 93 is not present in list so -1
/////////
//Converting arraylist to array in java using toArray()
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(50);
        al1.add(20);
        al1.add(98);
        al1.add(87);
        Integer arr[] = new Integer[al1.size()];
        arr = al1.toArray(arr);
    }
}
///////////////////////

//Converting an arraylist to array and returning it
import java.util.*;
import com.google.common.primitives.Ints;
class codechef
{
    public static int[] func(ArrayList<Integer> list)
    {
        System.out.println(list);
        int[] arr = Ints.toArray(list);
        return arr;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int[] arr = func(list);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
Output:
[10, 20, 30, 40]
10 20 30 40 

/////////////////////

//Contains() returns boolean value | returns true if value is present else false
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(20);
        list.add(98);
        list.add(87);
        boolean res = list.contains(10);
        if(res)
            System.out.print("list contains 10");
        else
            System.out.print("list donot contain 10");
    }
}

//================

//remove method/s on array list
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(20);
        list.add(98);
        list.add(87);
        System.out.println("Actual List: "+ list);
        
        list.remove(new Integer(20)); //removes first occurence of 20  | to remove using value
        System.out.println(list);
        
        list.remove(0); // removes 10 | to remove using Index
        System.out.println(list);
        
        list.removeAll(list);
        System.out.println(list);
    }
}
//===================

//removing elements from arraylist based on condition using in-built method

import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2  = new ArrayList<String>();
        list1.add(10);
        list1.add(20);
        list1.add(50);
        list1.add(20);
        list1.add(98);
        list1.add(87);
        
        list2.add("Snow");
        list2.add("Snow king");
        list2.add("Stark");
        list2.add("Lannister");
        
        System.out.println(list1);
        list1.removeIf(n -> (n%2==0)); // removes every n divisible by 2
        System.out.println(list1);
        
        System.out.println(list2);
        list2.removeIf(n -> (n.charAt(0)=='S')); //removes every n starting with S
        System.out.println(list2);
    }
}
Output:
[10, 20, 50, 20, 98, 87]
[87]
[Snow, Snow king, Stark, Lannister]
[Lannister]
//=======
//removing elements in specified range | ArrayOutOfIndexBoundsException may occur if range is mentioned is larger than arraylist
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(50);
        list1.add(20);
        list1.add(98);
        list1.add(87);
        
        System.out.println(list1);
        list1.subList(0,2).clear(); 
        System.out.println(list1);
    }
}
//=========

//replaceAll() 
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(50);
        list1.add(20);
        list1.add(98);
        list1.add(87);
        
        System.out.println(list1);
        list1.replaceAll(n -> n+10);
        System.out.println(list1);
        //list2.replaceAll(n -> n.toUpperCase());
    }
}
Output: [20, 30, 60, 30 108, 97]
//retailAll()
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(50);
        list1.add(20);
        
        list2.add(98);
        list2.add(87);
        list2.add(50);
        
        System.out.println("list 1: "+list1);
        System.out.println("list 2: "+list2);
        
        list1.retainAll(list2);
        System.out.println("list 1: "+list1);
        System.out.println("list 2: "+list2);
    }
}
Output:
list 1: [10, 20, 50, 20]
list 2: [98, 87, 50]
list 1: [50]
list 2: [98, 87, 50]
//================

//replace element using index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(50);
        list1.add(20);
        
        System.out.println("Actual list: "+list1);
        
        list1.set(0,94);
        System.out.println("Modified list: "+list1);
        
    }
}
