import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

 public class Main{
    static class Reader
    {
    BufferedReader r;
    StringTokenizer str;
    Reader()
    {
        r=new BufferedReader(new InputStreamReader(System.in));
    }
    Reader(String fileName) throws FileNotFoundException
    {
        r=new BufferedReader(new FileReader(fileName));
    }
    public String getNextToken() throws IOException
    {
        if(str==null||!str.hasMoreTokens())
    {
        str=new StringTokenizer(r.readLine());
    }
        return str.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(getNextToken());
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(getNextToken());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(getNextToken());
    }
    public String nextString() throws IOException
    {
        return getNextToken();
    }
    public int[] intArray(int n) throws IOException
    {
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=nextInt();
       
        return a;
       
    }
    public long[] longArray(int n) throws IOException
    {
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=nextLong();
       
        return a;
       
    }
    public String[] stringArray(int n) throws IOException
    {
        String a[]=new String[n];
        for(int i=0;i<n;i++)
            a[i]=nextString();
       
        return a;
       
    }
    public long gcd(long a, long b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    }
   //
    static int ans=0;
    static int permute(long[][] arrMin, int len, int rem) 
    {
    	int currans=0;
        if (len == arrMin.length) 
        {
        	
            for (int i = 0; i < arrMin.length; i++) 
            {
            	if(arrMin[i][1]<0)
            	{
                	if(rem>=arrMin[i][0])
                	{
                		rem-=arrMin[i][0];
                	}
                	else currans+=arrMin[i][1];
            	}
            	else currans+=arrMin[i][1];
            }
            if(ans<currans) ans=currans;
        } 
        else 
        {
            for (int i = len; i < arrMin.length; i++) 
            {
                long temp = arrMin[len][0];
                arrMin[len][0] = arrMin[i][0];
                arrMin[i][0] = temp;
 
                long temp2 = arrMin[len][1];
                arrMin[len][1] = arrMin[i][1];
                arrMin[i][1] = temp2;
                
                permute(arrMin, len + 1,rem);

                temp = arrMin[len][0];
                arrMin[len][0] = arrMin[i][0];
                arrMin[i][0] = temp;
                
                temp = arrMin[len][1];
                arrMin[len][1] = arrMin[i][1];
                arrMin[i][1] = temp;
            }
        }

        //System.out.println(ans+" "+currans);
        return ans;
    }
    
    
    public static void main(String args[]) throws IOException{

       Reader r=new Reader();
       PrintWriter pr=new PrintWriter(System.out,false);

       // HOLES
/*       int testcases=r.nextInt();
       String [] cases=new String[testcases];
       int answr[]=new int [testcases];
       
       for(int a=0;a<testcases;a++)
       {
    	   cases[a]=r.nextString();
    	   int count=0;
    	   String temp=cases[a];
    	   for(int i=0;i<temp.length();i++)
    	   {
    		   if((temp.charAt(i)=='A')||(temp.charAt(i)=='D')||(temp.charAt(i)=='O')||(temp.charAt(i)=='P')||(temp.charAt(i)=='Q')||(temp.charAt(i)=='R'))
    			   count++;
    		   else if((temp.charAt(i)=='B')) 
    			   count+=2;
    	   }
    	   answr[a]=count;
       }   
       for(int c=0;c<testcases;c++)
       {
    	   pr.println(answr[c]);
       }*/
       //DOUBLE
       
       int testcases=r.nextInt();
       long answr[]=new long [testcases];
       
       for(int a=0;a<testcases;a++)
       {
    	   long temp=r.nextLong();
    	   
    	   if(temp%2==0) answr[a]=temp;
    	   else answr[a]=temp-1;
       }   
       for(int c=0;c<testcases;c++)
       {
    	   pr.println(answr[c]);
       }
       
       pr.flush();
       pr.close();
    }
 }
