import java.lang.*;
import java.util.*;
class jonny
{
	static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {
		int test=ip.nextInt();
		while(test!=0)
		{
		int len=ip.nextInt();
		int data[]=new int[len];
		for(int i=0;i<len;i++)
		{
         data[i]=ip.nextInt();
		}	
		int k=ip.nextInt();
		k-=1;
		int val=data[k];
		Arrays.sort(data);
		int i=0;
		for(;i<len;i++)
		{
         if(data[i]==val)
         {
         break;
         }
		}
		System.out.println(i+1);
        test-=1;
		}
	}
}