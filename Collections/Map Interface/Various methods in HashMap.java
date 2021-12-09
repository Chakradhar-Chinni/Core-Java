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

//Fetching value using key | size of HashMap
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1001,10);
        map.put(1002,20);
        
        int size = map.size();
        int value = map.get(1001);
        
        System.out.println("HashMap size is: "+size);
        System.out.println(value);
    }
}
/*
Output:
HashMap size is: 2
10
*/

//Check if HashMap contains given key, contains given value
// containsKey(), containsValue() returns boolean value
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1001,10);
        map.put(1002,20);
        
        boolean res1 = map.containsKey(1001);
        boolean res2 = map.containsValue(20);
        
        
        boolean res3 = map.containsKey(001);
        boolean res4 = map.containsValue(23);
        
        System.out.println(res1 +"::"+ res2);
        System.out.println(res3 +"::"+ res4);
    }
}
/*
Output:

true::true
false::false
*/
