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
       System.out.println(list1.indexOf(30)); // returns -1 if element is not present
       System.out.println(list1.lastIndexOf(30));  // returns -1 if element is not present
    }
}  
Output:
10
2
4

//replacing element using index
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(98);
        
        System.out.println(list);
        list.set(2,80);
        System.out.println(list);
    }
}
Output:
[10, 20, 30, 98]
[10, 20, 80, 98]

//adding elements at first, last of linkedlist
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(98);
        
        list.offer(65);  //adds element at end of linkedlist, returns boolean value
        list.offerLast(66); //adds element at end of linkedlist, returns boolean value
        list.offerFirst(64); //adds element at front of linkedlist, returns boolean value
        
        System.out.println(list);
    }
}
Output:
[64, 10, 20, 30, 98, 65, 66]

//poll & peek methods
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(98);
        
        System.out.println(list.peek());        //it retrieves first element of list
        System.out.println(list.peekFirst());   //it retrieves first element of list, returns null if list is empty
        System.out.println(list.peekLast());    //it retrieves last element of list, returns null if list is empty
        
        System.out.println(list);
        
        System.out.println(list.poll());  //retrieves and removes first element of list
        System.out.println(list.pollFirst()); //retrieves and removes first element of list
        System.out.println(list.pollLast());  //retrieves and removes last element of list
        
        System.out.println(list);
    }
}
Output:
10
10
98
[10, 20, 30, 98]
10
20
98
[30]

// remove methods in linkedlist
import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(98);
        
        list.remove(); // retrieves and removes I element of list
        list.remove(0); // retrieves and removes based on index
       // list.remove(98); //removes based on object
        System.out.println(list);
        
        list.add(10);
        list.add(58);
        list.add(26);
        list.add(20);
        list.add(27);
        list.add(30);
        list.add(26);
        list.add(98);
        list.add(27);
        
        list.removeFirst();  // removes and returns I element of list
        list.removeLast();  //  removes and returns last element of list
        list.removeFirstOccurrence(26); // returns boolean value
        list.removeLastOccurrence(27); // returns boolean value
        
        System.out.println(list);
        
    }
}
Output:
[30, 98]
[98, 10, 58, 20, 30, 26, 98]
