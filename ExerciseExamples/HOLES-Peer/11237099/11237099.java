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
                if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
                holes++;
                else if(c=='B')
                holes= holes+2;
            }
            System.out.println(holes);
        }
    }
}