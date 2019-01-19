import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	int t = Integer.parseInt(in.readLine());
	for(int i=0;i<t;i++)
	{
	    int n = Integer.parseInt(in.readLine());
	   int root = 0;
	    for(int j=0;j<n;j++)
	    {
	     String temp[] = in.readLine().split(" ");
         root = root + Integer.parseInt(temp[0]) -Integer.parseInt(temp[1]);
 	    }

	    out.append(String.valueOf(root));
	    out.newLine();
	}
	out.flush();
	
}
    
}
 