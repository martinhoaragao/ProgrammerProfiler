import java.util.Arrays;
import java.util.Scanner;

class Johny {

	public static void main(String[] args) 
	{
		
        Scanner sc=new Scanner(System.in);
		
		int t,i=0;
		t=sc.nextInt();
		int[] ans=new int[t];
		
		while(i<t)
		{
			int n,j,pos,fav;
			n=sc.nextInt();
			int[] song=new int[n];
			for(j=0;j<n;j++)
				song[j]=sc.nextInt();
			
			pos=sc.nextInt();
			
			fav=song[pos-1];
			
			Arrays.sort(song);;
			
			for(j=0;j<n;j++)
			{
				if(song[j]==fav)
				{
					pos=j+1;
					break;
				}
			}
			
			ans[i]=pos;

			i++;
		}
		
		for(int k=0;k<t;k++)
			System.out.println(ans[k]);
		
	}

}
