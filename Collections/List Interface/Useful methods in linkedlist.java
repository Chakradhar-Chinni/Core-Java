//adding elements using index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        boolean r = list.add(50);
        System.out.println(list);
        
        list.add(0,100);
        System.out.println(list);
        System.out.print(r);
    }
}
Output:
[10, 20, 30, 40, 50]
[100, 10, 20, 30, 40, 50]
true


//merging two linked lists
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
                        
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        System.out.println(list1);
        System.out.println(list2);
        list1.addAll(list2);  //list2 will be appended at end of list1
        System.out.println(list1);
    }
}
Output:
[10, 20, 30, 40]
[100, 200, 300, 400]
[10, 20, 30, 40, 100, 200, 300, 400]

//merging lists based on index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40); 
                        
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        
        System.out.println(list1);
        System.out.println(list2);
        
        list1.addAll(1,list2);
        System.out.println(list1);
    }
}
Output:
[10, 20, 30, 40]
[100, 200, 300, 400]
[10, 100, 200, 300, 400, 20, 30, 40]

// adding element at first, last index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
                        
        System.out.println(list1);
        
        list1.addFirst(100);
        list1.addLast(93);
        
        System.out.println(list1);
    }
}
Output:
[10, 20, 30, 40]
[100, 10, 20, 30, 40, 93]

//removing all elements of linkedlist
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
                        
        System.out.println(list1);
        
        list1.clear();
        System.out.println(list1);
    }
}
Output:
[10, 20, 30, 40]
[]

//traversing linkedlist from backwards
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
                        
        Iterator x = list1.descendingIterator();
        while(x.hasNext())
            System.out.print(x.next()+" ");
    }
}
Output:
40 30 20 10 

 //fetching first, last elements in linkedlist
 import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
                        
        System.out.println(list1.element());  //returns first element of linkedlist
        System.out.println(list1.getFirst()); //returns first element of linkedlist
        System.out.println(list1.getLast());  //returns last element of linkedlist
    }
}
Output:
10
10
40

// fetching elements based on index, fetching index of first, last occurence
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(30);
                        
       System.out.println(list1.get(0));  // returns element at specified index
       System.out.println(list1.indexOf(30));
       System.out.println(list1.lastIndexOf(30));
    }
}  
Output:
10
2
4
