import java.util.Scanner;
class holesintext
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String s = sc.next();
            s = s.toUpperCase();
            int holes = 0;
            for(int j=0;j<s.length();j++)
            {
                char c = s.charAt(j);
                switch(c)
                {
                    case 'A':                 
                    case 'D':
                    case 'O':
                    case 'P':                   
                    case 'Q':
                    case 'R':
                    holes++;
                    break;
                    case 'B':
                    holes = holes+2;
                    break;
                }
            }
            System.out.println(holes);
        }
    }
}