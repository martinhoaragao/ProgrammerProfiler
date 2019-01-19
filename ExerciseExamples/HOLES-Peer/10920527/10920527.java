import java.io.*;
import java.util.*;
 
class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
		for(int i=0;i<n1;i++){
            int sum=0;
			String s=br.readLine();
			char a[]=s.toCharArray();
            for(int j=0;j<a.length;j++){
                sum=sum+hole(a[j]);
            }
            System.out.println(sum);
		}
	}
	
	static int hole(char ch){
        if(ch=='B')
            return 2;
        else if(ch=='A' || ch=='Q' || ch=='D' || ch=='O' || ch=='P'|| ch=='R')
            return 1;
        else
            return 0;
    }
				
	}
