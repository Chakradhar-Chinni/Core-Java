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
