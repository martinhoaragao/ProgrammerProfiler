    import java.io.*;
    class PRO
    {
    public static void main(String[]args)throws IOException
    {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(b.readLine());
    char c;
    while(n-->0)
    {
    int g=0;
    String s=b.readLine();
    for(int i=0;i<s.length();i++)
    {
    c=s.charAt(i);
    if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
    g=g+1;
    else if(c=='B')
    g+=2;
    }
    System.out.println(g);
    }
    }
    }    