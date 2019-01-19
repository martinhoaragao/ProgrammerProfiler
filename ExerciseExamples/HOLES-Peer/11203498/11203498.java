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
                switch(c)
                {
                    case 'A':                 
                    case 'D':
                    case 'O':
                    case 'R':                   
                    case 'P':
                    case 'Q':
                    holes++;
                    break;
                    case 'B':
                    holes=holes+2;
                    break;
                    default:holes=holes;
                    break;
                }
            }
            System.out.println(holes);            
        }
    }
}
