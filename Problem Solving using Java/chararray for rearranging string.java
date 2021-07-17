import java.util.Scanner;
public class arrange_in_alpah_order_using_charArray 
{
	    static void remove(char[] str)
	    {
	        int i,j;
	        for(i=0;i<str.length;i++)
	        {
	            for(j=i+1;j<str.length;j++)
	            {
	                if(str[i]>str[j])
	                {
	                    char temp = str[i];
	                    str[i] = str[j];
	                    str[j] = temp;
	                }
	            }
	        }
	        System.out.println(str);
	    }
		public static void main(String[] args) 
		{
			//System.out.println("Hello World");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			char[] str = s.toCharArray();
			remove(str);
		}
	}
