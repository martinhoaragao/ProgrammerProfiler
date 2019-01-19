import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.StringTokenizer;
 class Ruff2 
{ 
    public static void main(String[] args) 
    {
        Scanner vicky=new Scanner(System.in);
        int n=vicky.nextInt();
        int [][]ar=new int [2][n];
        for(int i=0;i<n;i++)
            ar[0][i]=vicky.nextInt();
        for(int i=0;i<n;i++)
            ar[1][i]=vicky.nextInt();
        int [] l = new int[n];
        l[0] = Math.abs(ar[0][0]-ar[1][0]);
        l[1]=max(Math.abs(ar[0][1]-ar[1][1])+Math.abs(ar[0][0]-ar[1][0]),Math.abs(ar[0][0]-ar[0][1])+Math.abs(ar[1][0]-ar[1][1]));
        for(int i=2;i<n;i++)
        {
            l[i]=max(l[i-1]+Math.abs(ar[0][i]-ar[1][i]),l[i-2]+Math.abs(ar[0][i-1]-ar[0][i])+Math.abs(ar[1][i]-ar[1][i-1]));
        }
        System.out.println(l[n-1]);
    }
    static int max(int a,int b)
    {
        return (a>b?a:b);
    }
}
