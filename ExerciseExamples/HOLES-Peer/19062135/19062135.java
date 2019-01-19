import java.util.*;
class HOLES
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int c=0;
            for(int x=0;x<s.length();x++)
            {
                char ch=s.charAt(x);
                //ABCDEFGHIJKLMNOPQRSTUVWXYZ
                if(ch=='B')
                    c+=2;
                else if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
                    c++;
            }
            System.out.println(c);
        }
    }
}