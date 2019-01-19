import java.util.Scanner;

class Test 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            char c;
            int count =0;
            for (int i = 0; i < s.length(); i++) 
            {
                c=s.charAt(i);
                if(c=='A' ||c=='D' ||c=='O'||c=='P'||c=='Q'||c=='R')
                {
                    count++;
                }
                else if(c=='B')
                {
                    count = count +2;
                }
            }
            System.out.println(count);
        }
    }
}
