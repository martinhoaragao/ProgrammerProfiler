import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in=new Scanner(System.in);
    	Solution s=new Solution();
    	int t=in.nextInt();
    	while(t>0) {
    		int n=in.nextInt();
    		int arr[][]=new int[n][2];
    		int i;
    		for(i=0;i<n;i++) {
    			arr[i][0]=in.nextInt();
    			arr[i][1]=in.nextInt();
    		}
    		int sum=0,count=0;
    		for(i=0;i<n;i++){
    			sum+=arr[i][0];
    			count+=arr[i][0]+arr[i][1];
    		}
    		System.out.println(2*sum-count);
    		t--;
    	}
    	in.close();
    }
}