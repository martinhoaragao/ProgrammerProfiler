import java.util.*;
class Codechef2 {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	int [] arr = new int [26];
    	arr[0]=1; arr[1]=2; arr['D'-65]=1; arr['O'-65]=1; arr['P'-65]=1;
    	arr['Q'-65]=1; arr['R'-65]=1;
    	while(t-->0){
    		String s = in.next();
    		long ans = 0;
    		for(int i=0; i<s.length(); i++){
    			ans+=arr[s.charAt(i)-65];
    		}
    		System.out.println(ans);
    	}
   }
}