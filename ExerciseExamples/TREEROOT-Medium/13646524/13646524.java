import java.util.*;
import java.lang.*;
import java.io.*;

class treeroot{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t>0){

			int sum_of_ids = 0;
			int sum_of_childs = 0;

			int n = sc.nextInt();

			while(n>0){

				int id = sc.nextInt();
				int sid = sc.nextInt();

				sum_of_ids+= id;
				sum_of_childs+= sid;
				n--;
			}
			System.out.println(sum_of_ids - sum_of_childs);
			t--;
		}

	}
}