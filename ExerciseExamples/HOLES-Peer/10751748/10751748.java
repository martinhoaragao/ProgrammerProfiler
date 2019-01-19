import java.util.*;
class Holes_In_Text {
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int c=0;
            String s;
            s=sc.next();
            int l=s.length();
            for(int j=0;j<l;j++)
            { 
                if(s.charAt(j)=='A'||s.charAt(j)=='D'||s.charAt(j)=='O'||s.charAt(j)=='P'||s.charAt(j)=='Q'||s.charAt(j)=='R') 
                { 
                    c++;
                } 
                else if(s.charAt(j)=='B')
                {
                    c+=2;
                }
            }
            System.out.println(c);
        }
    }
}