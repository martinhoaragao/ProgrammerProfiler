


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Johny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int j=0; j<n; j++)
				list.add(sc.nextInt());
			
			int positionUnordered = sc.nextInt();
			int value = list.get(positionUnordered-1);
			Collections.sort(list);
			int position = list.indexOf(value);
			System.out.println(position+1);
			
		}
	}
}
