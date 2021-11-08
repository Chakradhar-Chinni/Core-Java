import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(450);
        
        for(Integer i: list)  // Iterator
            System.out.print(i+" ");
    }
}
