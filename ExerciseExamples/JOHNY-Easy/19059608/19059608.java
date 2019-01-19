    /* package codechef; // don't place package name! */
     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Codechef
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    		int t = Integer.parseInt(br.readLine().trim());
    		while(t-->0){
    		   int n = Integer.parseInt(br.readLine().trim());
    		   String[] s = br.readLine().split(" ");
    	int k = Integer.parseInt(br.readLine().trim());
    	int [] arr = new int[n];
    	for (int i=0;i<n;i++){
    	    arr[i]= Integer.parseInt(s[i]);
    	}
    	int initNum = arr[k-1];
    	Arrays.sort(arr);
    	for (int i=0;i<n;i++){
    	    if (arr[i]==initNum){
    	        System.out.println(i+1);
    	        break;
    	    }
    	}
    		}
    	}
     
    } 