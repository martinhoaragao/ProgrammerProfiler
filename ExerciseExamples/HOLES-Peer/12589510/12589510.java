import java.util.Scanner;
class Holes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String str=in.nextLine();
            int c=0;
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch=='A' || ch =='D' || ch == 'O' || ch == 'P' || ch =='Q' || ch =='R' )
		{
                    c++;
		}
 		if(ch=='B')
 		{
                    c+=2;
		}        
            }
            System.out.println(c);
        }
    }
}