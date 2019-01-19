import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int z=0;
	public static void main(String [] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(t=t; t>0; t--)
		{
			int n=Integer.parseInt(br.readLine());
			pair ar[]=new pair[n];
			boolean ar1[]=new boolean[n];
			for(int i=0; i<n;i++)
			{
				StringTokenizer tk=new StringTokenizer(br.readLine());
				ar[i]=new pair(Integer.parseInt(tk.nextToken()),Integer.parseInt(tk.nextToken()));
			}
			Arrays.sort(ar,new Comparator<pair>(){
			@Override
			public int compare(pair a,pair b)
			{
				return Integer.compare(a.x,b.x);
			}
			});
			HashMap<Integer,Integer>hm=new HashMap<>();
			for(int i=0; i<n; i++)
			{
				hm.put(ar[i].x,i);
			}
			//for(int i=0; i<n; i++)
			z=0;
			find(ar1,0,0,ar,hm);
			System.out.println(z);
			/*for(int i=0; i<n; i++)
			{
				if(!ar1[i])
				{
					//System.out.print(ar1[i]+" ");
					System.out.println(ar[i].x);
					break;
				}
			}
			System.out.println();
			*/
		}
	}
	public static boolean find(boolean ar1[],int i,int count,pair ar[],HashMap<Integer,Integer>hm)
		{	
			int n=ar1.length;
				if(i==n && count==n-1)
				{
					for(int j=0; j<n; j++)
					{
						if(!ar1[j])
						{
							z=ar[j].x;
							break;
						}
					}
					return true;
				}
				if(i==n && count!=n-1)
				return false;
				boolean flag=false;
				if(ar[i].y==0)
				{
					flag=flag || find(ar1,i+1,count,ar,hm);
					//continue;
				}			
				if(hm.containsKey(ar[i].y))
				{
					if(!ar1[hm.get(ar[i].y)] && hm.get(ar[i].y)!=i)
					{
						ar1[hm.get(ar[i].y)]=true;
						flag=flag||find(ar1,i+1,count+1,ar,hm);
						if(!flag)
						{
							ar1[hm.get(ar[i].y)]=false;
						}
					}
				}
				{
					int l=0;
					int h=n-1;
					//int f=0;
					//int d=0;
					while(l<h && !flag)
					{
						if(ar1[l]==true)
						{
							l++;
							continue;
						}
						if(ar1[h]==true)
						{
							h--;
							continue;
						}
						if(ar[l].x+ar[h].x>ar[i].y)
						h--;
						else if(ar[l].x+ar[h].x<ar[i].y)
						l++;
						else
						{
							//f=l;
							//d=h;
							ar1[l]=true;
							ar1[h]=true;
							flag=flag || find(ar1,i+1,count+2,ar,hm);
							ar1[l]=false;
							ar1[h]=false;
							//break;
							l++;
							h--;
						}
					}
					//ar1[f]=true;
					//ar1[d]=true;
				/*	if(l==h && ar[l].x==ar[i].y && !ar1[l])
					{
						ar1[l]=true;
					}*/
				}
				return flag;
		}
}
class pair implements Comparable<pair>{
	int x,y;
	pair(int a,int b)
	{
		x=a;
		y=b;
	}
	@Override
	public int compareTo(pair b)
	{
		return Integer.compare(y,b.y);
	}
} 