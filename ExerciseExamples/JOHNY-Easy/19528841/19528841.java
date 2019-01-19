import java.util.*;
 
class Ab{
  public static void main(String as[])
  {
  	Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    for(int l=0;l<t;l++)
    {
    	int n=in.nextInt();
    	int []a=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i]=in.nextInt();
    	}
    	int k=in.nextInt();
    	int x=a[k-1];
    	Arrays.sort(a);
    	for(int i=0;i<n;i++)
    	{
    		if(a[i]==x)
    		{
    			System.out.println(i+1);
    			break;
    		}
	    }
    }
  }
}