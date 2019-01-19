import java.util.*;
class Tickets
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            String s=sc.next();
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='A' ||s.charAt(j)=='D'||s.charAt(j)=='O'||s.charAt(j)=='P'||s.charAt(j)=='R'||s.charAt(j)=='Q')
                    count++;
                if(s.charAt(j)=='B')
                    count+=2;
            }
            System.out.println(count);
        }
    }
}