import java.util.*;
import java.lang.*;
class UncleJohny
{
   public static void main(String args[])
   {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int s=sc.nextInt();//no of songs
			int arr[]= new int[s];
			for(int i=0;i<s;i++){
				arr[i] = sc.nextInt();
			}
			int f=sc.nextInt();//fav song pos
			int count=1;
			for(int i=0;i<s;i++){
				if(arr[f-1]>arr[i])
				   count++;
			}
			System.out.println(count);
			t--;
		}
	}
}