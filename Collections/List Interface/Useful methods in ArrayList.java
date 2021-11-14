//adding elements using add method into Integer Generic
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
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
        al.add("B");
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
        al.add(30);
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
        al.add("C");
        al.add(0,"Z");
        System.out.print(al);
    }
}
Output: [Z, A, B, C]
//=======================
