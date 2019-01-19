

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class OrderingSoldiers {

	public static void main(String args[]) {

		Scanner in = null;
		try {
			in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			int testCases = in.nextInt();

			int i = 0;

			while (in.hasNext()) {

				int soldiers = in.nextInt();
				List<Integer> ordering = new ArrayList<Integer>();
				int[] moves = new int[soldiers];
				for (int j = 0; j < soldiers; j++) {
					moves[j] = in.nextInt();
					ordering.add(j + 1);
				}

				int[] initialOrdering = new int[soldiers];
				for (int j = soldiers - 1; j >= 0; j--) {
					initialOrdering[j] = ordering.remove(ordering.size()-1-moves[j]);
				}
				
				for(int j=0;j<initialOrdering.length;j++){
					
					if(j == initialOrdering.length -1){
						System.out.println(initialOrdering[j]);

					}else {
						System.out.print(initialOrdering[j]+" ");

					}
					
				}
				
				i++;
				if (i == testCases) {
					break;
				}

			}

		} catch (Exception e) {

			System.out.println("Error " + e);
		} finally {
			in.close();

		}
	}

}
