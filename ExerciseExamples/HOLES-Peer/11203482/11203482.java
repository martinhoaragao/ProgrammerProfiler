import java.util.*;
class holes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch,k,i,holes=0;
        String s;
        char c;
        ch=sc.nextInt();       
        for(k=1;k<=ch;k++)
        {
            holes=0;
            s=sc.next();
            for(i=0;i<s.length();i++)
            {
                c=s.charAt(i);
                if(c=='A'||c=='D'||c=='O'||c=='R'||c=='P'||c=='Q')
                    holes++;
                else if (c=='B') holes+=2;
            }
            System.out.println(holes);            
        }
    }
}
