import java.util.*;
class HOLES
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int a,i;
        for(a=0;a<t;a++)
        {
            String S=sc.nextLine();
            int sum=0;
            for(i=0;i<S.length();i++)
            {
                sum+=hole(S.charAt(i));
            }
            System.out.println(sum);
        }
    }

    static int hole(char c)
    {
        if(c=='a'||c=='b'||c=='d'||c=='e'||c=='o'||c=='p'||c=='q'||c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
            return 1;
        else if(c=='B')
            return 2;
        else 
            return 0;
    }
}