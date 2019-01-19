import java.util.*;
import java.io.*;
class life {
    public static void main(String args[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        while(n!=42)
        {
            System.out.println(n);
            n=s.nextInt();
        }
    }
}