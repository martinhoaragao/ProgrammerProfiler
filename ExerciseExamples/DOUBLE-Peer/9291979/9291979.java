import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Codechef
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCases = Integer.parseInt(rd.readLine());
        
        for(int i=0;i<testCases;i++)
        {
            int length = Integer.parseInt(rd.readLine());
            if(length%2==0)
            {
                wr.write(length+"\n");
            }
            else
            {
                wr.write((length-1)+"\n");
            }
        }
        wr.close();
    }
}