//package practide;

import java.util.*;

class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//int t=s.nextInt();
		long ar[]=new long[10000000];
		for(int j=0;j<10000000;j++)
			ar[j]=-1;
		for(int j=0;j<12;j++)
			ar[j]=j;
		PriorityQueue<Long> pq = new PriorityQueue<Long>(new Comparator<Long>(){
			@Override
			public int compare(Long l1, Long l2) {
				return (int)(l2-l1);
			}
		});
		for(int j=12;j<10000000;j++)
		{
			//pq.add( (long)j);
			long ans = 0;
			ar[j]=ar[j/2]+ar[j/3]+ar[j/4];
		}
		while(s.hasNext())
		{
			long n=s.nextInt();
			/*
			long ans=0,curr=n;
			ans=(curr/2)+(curr/3)+(curr/4);
			while(ans>curr)
			{
				curr=ans;
				ans=(curr/2)+(curr/3)+(curr/4);
				//System.out.println(ans);
			}
			*/
			
			pq.add( n);
			long ans = 0;
			while(pq.isEmpty() == false){
				long rem = pq.remove();
				//System.out.println(rem);
				if(rem <10000000){
					ans=ar[(int)rem];
					break;
				}
				else{
					pq.add(rem/2);
					pq.add(rem/3);
					pq.add(rem/4);
					//System.out.println("hii");
				}
			}
			while(pq.isEmpty() == false){
				long rem = pq.remove();
				ans+=ar[(int)rem];
			}
			/*if(ans>curr)
				System.out.println(ans);
			else
				System.out.println(curr);*/
			System.out.println(ans);
		}

	}
	

}
