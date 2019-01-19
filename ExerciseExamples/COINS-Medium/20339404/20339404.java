import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args)throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        while(str.length()>0)
        {
            int n=Integer.parseInt(str);
            long k= findmax(n);
            System.out.println(k);
            str=br.readLine();
            if(str==null)
            break;
         }
	}
	static long dp[]=new long[100000];
	static long max_value=0;
	public static long max(long n,long m)
	{
	    if(n>=m)
	    return n;
	    else
	    return m;
	}
    public static long findmax(int n)
    {
        if(n<100000&&dp[n]!=0)
        return dp[n];
        if(n<12){
        dp[n]=n;
        return n;}
        if(n<100000){
            max_value=max(n,findmax(n/2)+findmax(n/3)+findmax(n/4));
            dp[n]=max_value;
            return max_value;
        }
        else{
            max_value=findmax(n/2)+findmax(n/3)+findmax(n/4);
        }
        return max_value;
    }
}