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
