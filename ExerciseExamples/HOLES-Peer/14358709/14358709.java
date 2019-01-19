import java.math.BigInteger;
import java.util.*; 
class P
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(); 
        int i,j;
        for(j=0;j<cases;j++)
        {
        	int c = 0;
        	String s = sc.next();
        	String match = "ADOPQR";
        	for(i=0;i<s.length();i++)
        	{
        		if(s.charAt(i)=='B')
        		{
        			c=c+2;
        		}
        		if(match.indexOf(s.charAt(i)+"")!=-1)
        		{
        			c=c+1;
        		}
        	}
        	System.out.println(c);
        }
    }
}