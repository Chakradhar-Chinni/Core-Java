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
//Removing all entries of HashMap
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1001,10);
        map.put(1002,20);
        
        System.out.println(map);
        
        map.clear();
        System.out.println(map);
    }
}
/*
Output

{1001=10, 1002=20}
{}
*/

//replace() to replace a value using Key
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",10);
        map.put("b",20);
        map.put("c",30);
        map.put("d",40);
        map.put("e",50);
        
        System.out.println("Actual Map: "+map);
        
        map.replace("e",60);
        map.replace("b",40);
        System.out.println("New HashMap: "+map);
        
        //replace() to update using existing value
        map.replace("d",map.get("d")+10);
        System.out.println("Updated New HashMap: "+map);
    }
}
/*
Output:
Actual Map: {a=10, b=20, c=30, d=40, e=50}
New HashMap: {a=10, b=40, c=30, d=40, e=60}
Updated New HashMap: {a=10, b=40, c=30, d=50, e=60}
*/
