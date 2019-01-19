import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(b.readLine());
        String s;
        while(t-- > 0)
        {
            s = b.readLine();
            System.out.println("1\n" + s);
        }

    }
}