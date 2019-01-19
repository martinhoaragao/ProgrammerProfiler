import java.util.*;
class HOLES
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();sc.nextLine();
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";char x;int h=0;
        int holes[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0},ar[]=new int[t];
        for(int j=0;j<t;j++)
        {
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++)
            {
                x=str.charAt(i);
                for(int k=0;k<alpha.length();k++)
                {
                    if(x==alpha.charAt(k))
                    {
                        h+=holes[k];
                    }
                }
            }
            ar[j]=h;h=0;
        }
        for(int j=0;j<t;j++)
        {
            System.out.println(ar[j]);
        }
    }
}