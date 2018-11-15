/**
 * date :- 29/10/2018
 * author :-julie_11
 */

import java.util.ArrayList;
import java.util.Scanner;

class ORDERS1 {

	public static void main(String[] args) {
		int T;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T-->0)
		{
			int n = in.nextInt();
			ArrayList<Integer> list1 = new ArrayList<>(n);
			ArrayList<Integer> list2 = new ArrayList<>(n);
			for(int i=0;i<n;i++)
			{
				list1.add(i+1);
				list2.add(in.nextInt());
				if(list2.get(i)!=0)
				{
					int temp = list2.get(i);
					list2.remove(i);
					list2.add(i-temp, temp);
				}
			}
			for(int i=n-1;i>=0;i--)
			{
				if(list2.get(i)!=0)
				{
					int temp = list1.get(i);
					list1.remove(i);
					list1.add(i+list2.get(i),temp);
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(list1.get(i)+" ");
			}
			System.out.println();
		}
		in.close();
	}

}
