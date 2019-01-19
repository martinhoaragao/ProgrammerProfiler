import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class fifth_5
{
    public static void main(String args[])throws IOException
    {
        String test_str;
        int i=0,j,k,loop,N=0;
        char chk;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String test_cases[] = new String[40];                   
        N = Integer.parseInt(r.readLine());
        for(    ; i < N && N<=40 ; i++)
        {
            test_cases[i] = r.readLine();
        }
        for(j = 0; j < N; j++)
        {
           test_str = test_cases[j];
           loop=0;
           for(k = 0; k<test_str.length() && test_str.length()<=100 ; k++)
           {
               chk = Character.toLowerCase((test_str.charAt(k)));
               if(chk=='a'||chk=='d'||chk=='o'||chk=='p'||chk=='q'||chk=='r')
               {
                   loop+=1;
                }
               if(chk=='b')
               {
                   loop+=2;
                }
           }
           System.out.println(""+loop);
        }
        }
    }