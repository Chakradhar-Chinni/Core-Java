//adding elements :: .add()
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(23);
        
        System.out.println(set);
    }
}

Output:
[23, 10]


//size of HashSet , removing all items from HashSet
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(23);
        
        System.out.println(set.size());
        
        set.clear();
        System.out.println(set.size());
    }
}

Output:
2
0

 //contains(), remove()
 import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(23);
        set.add(43);
        set.add(54);
        set.add(439);
        boolean r = set.contains(43);  // contains() returns boolean
        System.out.println(r);
        
        if(set.contains(23))
          set.remove(23);
        
        System.out.println(set);
    }
}
Output:
true
[54, 439, 10, 43]
