import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner apples=new Scanner(System.in);
	int tc=apples.nextInt();
    
    for (int no=0;no<tc;no++)
    {
        int g=apples.nextInt();
        int counter1=0; int counter2=0;
        for (int h=0;h<g;h++)
        {
            int a=apples.nextInt();
            int b=apples.nextInt();
            counter1+=a; counter2+=b;
        }
        System.out.println(counter1-counter2);
    }
  
	}
}	
	
