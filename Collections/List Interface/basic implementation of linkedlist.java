import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        System.out.println(list);
        
        for(Integer i: list)      //fetching values using forEach loop
            System.out.print(i+" ");
    }
}
