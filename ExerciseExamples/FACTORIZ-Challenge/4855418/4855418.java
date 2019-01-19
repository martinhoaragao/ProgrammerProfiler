    import java.io.BufferedReader;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintWriter;
    import java.math.BigInteger;
    import java.text.DecimalFormat;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.StringTokenizer;
    public class Main {
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
    public Double nextDouble() throws IOException
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
    }
    public static void main(String args[]) throws IOException{
    int h=100000;
    boolean a[]=new boolean[h+1];
    Arrays.fill(a,true);
    for(int i=2;i*i<=h;i++)
    {
    if(a[i])
    {
    for(int x=i;x*i<=h;x++)
    {
    a[x*i]=false;
    }
    }
    }
    BigInteger prime[]=new BigInteger[h+1];int top=0,topl=0;
     
    long primelong[]=new long[h+1];
    for(int i=2;i<=h;i++)
    {
    if(a[i])
    primelong[topl++]=i;
    }
    for(int i=2;top<3877;i++)
    {
    if(a[i])
    prime[top++]=(BigInteger.valueOf(i));
    }
    // System.out.print(top);
    Reader r=new Reader();
    PrintWriter pr=new PrintWriter(System.out,false);
    int t=r.nextInt();
    while(t-->0)
    {
    String s=r.nextString();
    //
    try
    {
    ArrayList<Long> ar=new ArrayList<Long>();
    long num=Long.parseLong(s);
    for(int i=0;i<topl;i++)
    {
    long x=primelong[i];
    while(num%x==0)
    {
    ar.add(x);
    num=num/x;
    }
    if(num==1)
    break;
    }
    if(num!=1)
    ar.add(num);
    pr.println(ar.size());
    for(int i=0;i<ar.size();i++)
    pr.println(ar.get(i));
    }
    catch(Exception e)
    {
    ArrayList<BigInteger> ar=new ArrayList<BigInteger>();
    BigInteger num=new BigInteger(s);
    for(int i=0;i<top;i++)
    {
    BigInteger x=prime[i];
    while(num.mod(x).compareTo(BigInteger.ZERO)==0)
    {
    ar.add(x);
    num=num.divide(x);
    }
    if(num.compareTo(BigInteger.ONE)==0)
    break;
    }
    if(0!=num.compareTo(BigInteger.ONE))
    ar.add(num);
    pr.println(ar.size());
    for(int i=0;i<ar.size();i++)
    pr.println(ar.get(i));
    }
    }
    pr.flush();
    pr.close();
    }
    } 