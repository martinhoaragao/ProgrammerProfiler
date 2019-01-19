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
		int noOfCases = sc.nextInt();
		int sum,noOfNodes,sumChildren,nodeId;
		for (int x=1;x<=noOfCases;x++) {
		    sum = 0;
		    noOfNodes = sc.nextInt();
		    for (int y=1;y<=noOfNodes;y++) {
		        nodeId = sc.nextInt();
		        sumChildren = sc.nextInt();
		        sum = sum + (nodeId-sumChildren);
		    }
		    System.out.println(sum);
		}
	}
}
