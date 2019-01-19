import java.util.Scanner;
import java.util.Random;
class selection
{
	public static void main(String [] args)
	{
		//Random sd = new Random();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int k=0;k<T;k++)
		{
			int len = sc.nextInt(); 
			Node [] arr = new Node[len+1];
			for(int i=1;i<=len;i++)
			{
				int n = sc.nextInt();
				Node obj = new Node(n);
				arr[i] = obj; 
				//System.out.print(arr[i].data+" ");

			}
			int kth = sc.nextInt(); 

			for(int i=1;i<=len;i++)
			{
				if(i==kth)
				{
					arr[i].visited = true;
				}
			}
			//System.out.println(arr[kth].visited);
			//selection sc = new selection();
			//long starttime = System.nanoTime();
			for(int i=1;i<len;i++)
			{
				int min = i;
				for(int j=i+1;j<=len;j++)
				{
					if(arr[j].data<arr[min].data)
					{
						min = j;
					}
				}
				Node temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}

			for(int i=1;i<=len;i++)
			{
				if(arr[i].visited == true)
				{
					System.out.println(i);
				}
			}

		}
		//long endtime = System.nanoTime();

		//long time = endtime - starttime;

		//System.out.println(time);
		//System.out.println();
/*		for(int i=0;i<100;i++)
		{
			System.out.print(arr[i]+ " ");
		}
*/
	}



}

class Node 
{
	public boolean visited;
	public int data;

	public Node(int p)
	{
		data = p;
		visited = false;
	}
}