import java.util.*;

import java.lang.Math;

class Codechef{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String []args){
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			ArrayList<Integer> list1 = new ArrayList<Integer>(n);
			ArrayList<Integer> list2 = new ArrayList<Integer>(n);
			for(int i = 0; i < n; i++){
				list1.add(i+1);
				list2.add(in.nextInt());
				if(list2.get(i) != 0){
					int temp = list2.get(i);
					list2.remove(i);
					list2.add(i-temp, temp);
				}
			}
			for(int i = n-1; i >= 0; i--){
				if(list2.get(i) != 0){
					int temp = list1.get(i);
					list1.remove(i);
					list1.add(i+list2.get(i), temp);
				}
			}
			for(int i = 0; i < n; i++){
				System.out.print(list1.get(i) + " ");
			}
			System.out.println();
		}
	}
}