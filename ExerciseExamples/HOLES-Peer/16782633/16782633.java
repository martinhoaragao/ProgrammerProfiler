import java.util.*;
class Eight
{
    public static void main (String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            String str=ob.next();
            int l=str.length();
            int s=0;
            for(int j=0;j<l;j++)
            {
                char a=str.charAt(j);
                if(a=='A'||a=='D'||a=='O'||a=='P'||a=='Q'||a=='R')
                    s++;
                if(a=='B')
                    s=s+2;
            }
            System.out.println(s);
        }
    }
}