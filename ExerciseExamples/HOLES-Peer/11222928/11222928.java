import java.io.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        if(t<=40)
        {
            int i;
            for(i=1;i<=t;i++)
            {
                String s=br.readLine();
                char ch;
                int j;
                int count=0;
                for(j=0;j<s.length();j++)
                {
                    ch=s.charAt(j);
                    switch(ch)
                    {
                        case 'A':
                        case 'D':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R': count++;
                                  break;
                        case 'B': count=count+2;
                        break;
                    }
                }
                System.out.println(count);
            }
        }
    }
}