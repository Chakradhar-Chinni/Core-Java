import java.util.*;
public class Main
{
    static ArrayList<Integer> fun(int n,ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(10);
        arr1.add(200);
        return arr1;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr  = new ArrayList<Integer>();
      
        ArrayList<Integer> arr1 = fun(10,arr);
      
        Iterator itr = arr1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
