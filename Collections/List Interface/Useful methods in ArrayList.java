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
        ArrayList al1 = new ArrayList<Integer>();
        ArrayList al2 = new ArrayList<Integer>();
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
    
