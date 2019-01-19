import java.util.*;
class i{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int t1=1;
         while(t1<=t)
         {
         	int n=sc.nextInt();
         	int arr[]=new int[n+1];
         	for(int i=1;i<=n;i++)
         	{
         		arr[i]=sc.nextInt();

         	}
         	int k=sc.nextInt();
         	int v=arr[k];
         	Arrays.sort(arr,1,n+1);
         	for(int i=1;i<=n;i++){
         		if(arr[i]==v)
         		{
         			System.out.println(i);
         			break;
         		}
         	}
          t1++;
         }
		

	}
}