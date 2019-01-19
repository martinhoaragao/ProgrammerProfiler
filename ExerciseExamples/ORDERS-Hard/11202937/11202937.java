import java.io.*;
import java.util.*;

class ORDERS {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> newPosition = new ArrayList<Integer>();
			String[] input = br.readLine().split(" ");
			
                        for(int i = 0; i < n; i++){
                            int inputs = Integer.parseInt(input[i]);
            		    newPosition.add(inputs);
            		}
			String result = Arrays.toString(finalPosition(newPosition))
					.replace(",", "")  
				    .replace("[", "")  
				    .replace("]", "")  
				    .trim(); 
			System.out.println(result);
		}
	}

	private static int[] finalPosition(ArrayList<Integer> newPosition) {

		int a = newPosition.size();
		int[] finalPosition = new int[a];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < a; i++){
          	  int position = i - newPosition.get(i);
           	 list.add(position,i);
       		 }
        	for(int i = 0; i < list.size(); i++){
        		finalPosition[list.get(i)] = i + 1;
        	}
        	return finalPosition;
	}
}