import java.io.*;
import java.util.*;

class Del
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			int sz = sc.nextInt();
			int arr[] = new int[sz+1];
			for(int i=1;i<=sz;i++)
				arr[i]=sc.nextInt();
			int k = sc.nextInt();

			int song = arr[k];
			Arrays.sort(arr);
			int pos=0;
			for(int i=0;i<=sz;i++)
			{
				if(arr[i]==song)
				{
					pos = i;
					break;
				}
			}
			System.out.println(pos);


			t--;
		}	
	}
}