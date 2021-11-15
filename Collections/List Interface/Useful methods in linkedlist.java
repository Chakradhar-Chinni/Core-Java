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
