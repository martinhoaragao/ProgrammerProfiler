import java.util.*;
import java.io.*;
class DominoSolitaire
{

    
    /************************ SOLUTION STARTS HERE ***********************/
    private static int memo[];
    private static int brd[][];
    private static int func(int end)
    {
	if(end < 0)
	    return 0;
	else if(memo[end] != 0)
	    return memo[end];
	else
	{
	    int vertical = func(end - 1) + Math.abs(brd[0][end] - brd[1][end]);
	    int horizontal = (end != 0)
		    ? func(end - 2) + Math.abs(brd[0][end] - brd[0][end - 1]) + Math.abs(brd[1][end] - brd[1][end - 1])
		    : 0;
	    return memo[end] = Math.max(vertical, horizontal);
	}
    }
    
    private static void solve(FastScanner s1, PrintWriter out){

	int len = s1.nextInt();
	memo = new int[len + 10];
	brd = new int[2][len];
	brd[0] = s1.nextIntArray(len);
	brd[1] = s1.nextIntArray(len);
	memo[0] = Math.abs(brd[0][0] - brd[1][0]); // base case	
	out.println(func(len - 1));
    }


    
    /************************ SOLUTION ENDS HERE ************************/
    
    
    
    
    
    /************************ TEMPLATE STARTS HERE *********************/

    public static void main(String []args) throws IOException {
	new Thread(null, new Runnable() {
	    public void run() {
		new DominoSolitaire().run();
	    }
	}, "IncreaseStackPlzz", 1L << 25).start();

    }    
    public void run()
    {
	FastScanner in  = new FastScanner(System.in);
	PrintWriter out = 
		new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false); 
	solve(in, out);
	in.close();
	out.close();
    }
  

    static class FastScanner{
	BufferedReader reader;
	StringTokenizer st;
	FastScanner(InputStream stream){reader=new BufferedReader(new InputStreamReader(stream));st=null;}	
	String next()
	    {while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}		    
	     st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
	String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}	    	  	
	int    nextInt()   {return Integer.parseInt(next());}
	long   nextLong()  {return Long.parseLong(next());}		
	double nextDouble(){return Double.parseDouble(next());}
	char   nextChar()  {return next().charAt(0);}
	int[]  nextIntArray(int n)         {int[] arr= new int[n];   int i=0;while(i<n){arr[i++]=nextInt();}  return arr;}
	long[] nextLongArray(int n)        {long[]arr= new long[n];  int i=0;while(i<n){arr[i++]=nextLong();} return arr;}	
	int[]  nextIntArrayOneBased(int n) {int[] arr= new int[n+1]; int i=1;while(i<=n){arr[i++]=nextInt();} return arr;}	    	
	long[] nextLongArrayOneBased(int n){long[]arr= new long[n+1];int i=1;while(i<=n){arr[i++]=nextLong();}return arr;}	    	
	void   close(){try{reader.close();}catch(IOException e){e.printStackTrace();}}				
    }

    /************************ TEMPLATE ENDS HERE ************************/
}