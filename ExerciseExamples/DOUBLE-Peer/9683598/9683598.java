import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Collection;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Math;
import java.util.*;
 
class maxisum
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int i,j;
        while(t-- !=0)
        {
        	st=new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	if(n%2==0)
        		System.out.println(n);
        	else
        		System.out.println(n-1);
        }
    }
} 