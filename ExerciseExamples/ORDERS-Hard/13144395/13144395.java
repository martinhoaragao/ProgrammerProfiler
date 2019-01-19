import java.util.*;
import java.io.*;
class order{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
    		int n = sc.nextInt();
    		int[] moves = new int[n];
    		for(int i = 0; i < n; i++){
    			moves[i] = sc.nextInt();
    		}
    	    int[] rank = new int[n];
    		for(int i = 0; i < n; i++){
    			rank[i] = i+1;
    		}
    		for(int i = n-1; i >= 0; i--){
    		    int from = i-moves[i];
    		    int to = i;
    		    if(from != to) {
    		        putto(from,to,rank);
    		    }
    		}
    		for(int i = 0; i < n; i++){
    			System.out.print(rank[i] + " ");
    		}
    		System.out.println();
		}
	}
	
	public static void putto(int from, int to, int[] rank){
	    int temp = rank[from];
	    for(int i = from+1; i <= to; i++){
	        rank[i-1] = rank[i];
	    }
	    rank[to] = temp;
	}
}