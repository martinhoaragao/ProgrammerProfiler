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
		int t = sc.nextInt();
		for(int z = 0; z < t; z++) {
    		int n = sc.nextInt();
    		int[] moves = new int[n];
    		for(int i = 0; i < n; i++) {
    			moves[i] = sc.nextInt();
    		}
    	    int[] rank = new int[n];
    		for(int i = 0; i < n; i++) {
    			rank[i] = i+1;
    		}
    		for(int i = n-1; i >= 0; i--) {
    		    int from = i-moves[i];
    		    int to = i;
    		    if(from != to) {
    		        putto(from,to,rank);
    		    }
    		}
    		for(int i = 0; i < n; i++) {
    			System.out.print(rank[i] + " ");
    		}
    		System.out.println();
		}
	}
	
	public static void putto(int from, int to, int[] rank) {
	    int temp = rank[from];
	    for(int i = from+1; i <= to; i++) {
	        rank[i-1] = rank[i];
	    }
	    rank[to] = temp;
	}
}
