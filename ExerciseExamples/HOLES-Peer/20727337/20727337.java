import java.util.Scanner;

class holes
{
    public static void main(String[] args)
    {
        try
        {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int loop=t;
        int results[]=new int[t];
        int count;
        int p=0;
        while(t!=0)
        {
            count=0;
            String string=s.next();
            
            char str[]=new char[string.length()];
            for (int i = 0; i < string.length(); i++) 
            {
                str[i]=string.charAt(i);
            }
            for (int i = 0; i < string.length(); i++) 
            {
                if(str[i]=='A'||str[i]=='D'||str[i]=='O'||str[i]=='P'||str[i]=='Q'||str[i]=='R')
                {
                    count++;
                }
                if(str[i]=='B')
                {
                    count+=2;
                }
            }
            results[p++]=count;
//            System.out.println(results[--p]);
            t--;
        }
        s.close();
            for (int i = 0; i < loop; i++) 
            {
                System.out.println(results[i]);
            }
        }
        catch(Exception e)

        {
            System.out.println(e);
            return;
        }}
}
