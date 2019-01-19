import java.io.*;
import java.util.*;
class domsol
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[2][n+1];
        for(int i=0;i<2;i++)
        {
            String s[]=br.readLine().trim().split(" ");
            for(int j=1;j<=n;j++)
            {
                arr[i][j]=Integer.parseInt(s[j-1]);
            }
        }
        int dp[][]=new int[2][n+1];
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                dp[0][i]=0;
                dp[1][i]=Math.abs(arr[0][1]-arr[1][1]);
            }
            else
            {
                dp[0][i]=Math.abs(arr[0][i]-arr[0][i-1])+Math.abs(arr[1][i]-arr[1][i-1])+(int)Math.max(dp[0][i-2],dp[1][i-2]);
                dp[1][i]=Math.abs(arr[0][i]-arr[1][i])+(int)Math.max(dp[0][i-1],dp[1][i-1]);
            }
        }
        System.out.println((int)Math.max(dp[0][n],dp[1][n]));
    }
}