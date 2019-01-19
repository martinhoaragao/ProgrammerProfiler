/**
 * date :- 29/10/2018
 * Ref :- uprasad96
 */

import java.util.ArrayList;
import java.util.Scanner;

class ORDERS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T-->0)
		{
			int n = in.nextInt();
			int[] list1 = new int[n];
			int[] order = new int[n];
			ArrayList<Integer> list2 = new ArrayList<>(n);
			for(int i=0;i<n;i++)
			{
				list1[i]=in.nextInt();
				list2.add(i+1);
//				if(list2.get(i)!=0)
//				{
//					int temp = list2.get(i);
//					list2.remove(i);
//					list2.add(i-temp, temp);
//				}
			}
			for(int i=n-1;i>=0;i--)
			{
//				if(list2.get(i)!=0)
//				{
//					int temp = list1.get(i);
					order[i] = list2.remove(list2.size()-1-list1[i]);
//					list1.add(i+list2.get(i),temp);
//				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(order[i]+" ");
			}
			System.out.println();
		}
		in.close();
	}

}
