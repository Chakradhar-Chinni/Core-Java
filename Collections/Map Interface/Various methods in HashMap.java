//Inserting entries into map
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1001,10);
        map.put(1002,20);
        
        System.out.print(map);
    }
}
/*
Output:
{1001=10, 1002=20}
*/

// Removing entry using Key
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1001,10);
        map.put(1002,20);
        map.put(1003,30);
        map.put(1004,40);
        System.out.println("Actual Map: "+ map);
        
        map.remove(1003);
        
        System.out.println("After removing: "+ map);
    }
}
/*
Output:
Actual Map: {1001=10, 1002=20, 1003=30, 1004=40}
After removing: {1001=10, 1002=20, 1004=40}
*/
