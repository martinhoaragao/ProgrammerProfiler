import java.util.*;
class Easy_6
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Runtime runtime=Runtime.getRuntime();
	int testcase=sc.nextInt();
	if(testcase<1 || testcase>1000)
		runtime.exit(0);
	int ans[]=new int[testcase];
	int song,uncle_jonney,temp,i,j;
	for(i=0;i<testcase;i++)
	{
		song=sc.nextInt();
		if(song<1 || song>100)
			runtime.exit(0);
		int playlist[]=new int[song];
		//int uncle_jonney;
		for(j=0;j<song;j++)
		{
			playlist[j]=Integer.parseInt(sc.next());
		}
		uncle_jonney=sc.nextInt();
		temp=playlist[uncle_jonney-1];
		//System.out.println(temp);
		Arrays.sort(playlist);
		for(j=0;j<song;j++)
		{
			if(playlist[j]==temp)
			{
				ans[i]=j+1;
				break;
			}
		}
	}
	for(i=0;i<testcase;i++)
	{
		System.out.println(ans[i]);
	}
	}
}
		