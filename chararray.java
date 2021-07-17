import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    char[] chararr = new char[5];
      //char[] chararr = {'a','b','c','d','e'};
	    chararr[0] = 'a';
	    chararr[1] = 'b';
	    chararr[2] = 'c';
	    chararr[3] = 'd';
	    chararr[4] = 'e';
	    for(int i=0;i<chararr.length;i++)
	    {
	        System.out.println(chararr[i]);
	    }
	 }
}
