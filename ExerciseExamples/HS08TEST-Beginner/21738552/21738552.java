/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
      int X=scan.nextInt();
      float Y=scan.nextFloat();
     if(X%5!=0||((X+0.5)>Y))
     {
        System.out.print(Y);
     }
        else
        {
        System.out.println(Y-X-0.5);
        }
	}
}