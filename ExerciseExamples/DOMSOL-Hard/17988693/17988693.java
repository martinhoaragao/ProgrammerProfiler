import java.io.*;
import java.util.*;
class DominoSol
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int col=Integer.parseInt(br.readLine());
        int arr[][]=new int[2][col+1];
        for(int i=0;i<2;i++)
        {
            String st[]=br.readLine().trim().split(" ");
            for(int j=1;j<=col;j++)
            	arr[i][j]=Integer.parseInt(st[j-1]);
            
        }
        int tile[][]=new int[2][col+1];
        for(int i=1;i<=col;i++)
        {
            if(i==1) {
                tile[0][i]=0;
                tile[1][i]=Math.abs(arr[0][1]-arr[1][1]);  }
            else {
                tile[0][i]=Math.abs(arr[0][i]-arr[0][i-1])+Math.abs(arr[1][i]-arr[1][i-1])+(int)Math.max(tile[0][i-2],tile[1][i-2]);
                tile[1][i]=Math.abs(arr[0][i]-arr[1][i])+(int)Math.max(tile[0][i-1],tile[1][i-1]);  }
        }
        System.out.println((int)Math.max(tile[0][col],tile[1][col]));
    }
} 