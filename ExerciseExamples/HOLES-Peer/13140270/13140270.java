import java.util.*;
class balpha
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T,l,i,h;
        String s;
        T=sc.nextInt();
        while(T--!=0)
        {
            h=0;
            s=sc.next();
            l=s.length();
            for(i=0;i<l;i++)
            {
                switch(s.charAt(i))
                {
                    case 'B':
                    h+=2;
                    break;
                    case 'A':
                    case 'D':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    h++;
                    break;
                }
            }
            System.out.println(h);
        }
    }
}