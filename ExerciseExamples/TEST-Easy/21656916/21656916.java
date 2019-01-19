import java.io.*;
class bruteforce
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader y=new BufferedReader(x);
        int n;
        while(true)
        {
            n=Integer.parseInt(y.readLine());
            if(n==42)
            break;
            
            System.out.println(n);
        }
    }
} 