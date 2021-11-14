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
