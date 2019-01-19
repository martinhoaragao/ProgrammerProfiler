/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i = 0; i<testcases; i++){
		    int nodes =sc.nextInt();
		    int id_sum=0,total_children_sum=0;
		    for (int j=0; j<nodes; j++){
		        int id = sc.nextInt();
		        id_sum = id_sum + id;
		        int children_sum = sc.nextInt();
		        total_children_sum = total_children_sum + children_sum;
		    }
		    int result =  id_sum - total_children_sum;
		    System.out.print(result+"\n");
		}
	}
}
