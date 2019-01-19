import java.io.*;
import java.util.*;
 
class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
	for(int i=0;i<n1;i++){
		int n=Integer.parseInt(br.readLine());
		if(n%2==0)
			System.out.println(n);
		else
			System.out.println(n-1);
	}
    }
}