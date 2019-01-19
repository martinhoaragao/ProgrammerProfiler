/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for(int i=0;i<a;i++){
		 String s=in.next();
   char c[] = s.toCharArray();
   int hole = 0;
   for(int j=0;j<c.length;j++){
       if(c[j]== 'A' || c[j]== 'O' || c[j]== 'D' || c[j]== 'P' || c[j]== 'R'|| c[j]== 'Q'){
          hole++; 
   }
       if(c[j]== 'B'){
           hole = hole+2;
       }
      
}
    System.out.println(hole);
		
		}
	}
}
