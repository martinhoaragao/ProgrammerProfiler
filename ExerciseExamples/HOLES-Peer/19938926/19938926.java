import java.util.*;

class Lo
{
    /*FAtt gyi bbhai*/

    public static void main(String[] args)
    {
    	int cp=0;
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for(int i1=1;i1<=t;i1++)
    	{
    		int count=0;
    		char[] c = sc.next().toCharArray();
    		for(int i=0;i<c.length;i++)
    		{
    			if(c[i]=='A' ||  c[i]=='D' || c[i]=='O' || c[i]=='P' || c[i]=='R'||c[i]=='Q')
    			{
    				count++;
    			}
    			else if(c[i]=='B')
    			{
    				count+=2;
    			}


    		}
    		System.out.println(count);

    	}

    }


   
}

