import java.util.*;
class hole
{
    public static void main( String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            int k=0;
            for(int q=0;q<s.length();q++)
            {
                char ch=s.charAt(q);
                if(ch=='B')
                    k+=2;
                else if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
                    k++;
                else
                    k+=0;
            }
            System.out.println(k);
        }
    }
}   
