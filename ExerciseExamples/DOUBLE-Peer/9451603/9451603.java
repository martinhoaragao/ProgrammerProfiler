/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
        Scanner in=new Scanner(System.in);
        int t;
        long l;
        t=in.nextInt();
        while(t>0)
        {
            t--;
            l=in.nextLong();
            //System.out.println("L: "+l);
            if(l%2==0)
                System.out.println(l);
            else 
                System.out.println(l-1);
        }
    }
}