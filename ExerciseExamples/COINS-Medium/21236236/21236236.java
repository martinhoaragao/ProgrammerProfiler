

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ByteLandianCoin {

	
	static Map<Long,Long> solutions = new HashMap<Long,Long>();
	public static void main(String args[]) {

		Scanner in = null;	
		try {
			in = new Scanner(System.in);
			String line =null;

			while(in.hasNext()){	
				line =in.nextLine();
				System.out.println(solution(Long.parseLong(line)));
			}
		} catch (Exception e) {
			System.out.println("Error " + e);
		} finally {
			in.close();
		}
	}
	
	
	public static long solution(long coin){
		long solution = coin;
		
		if(coin<12){
			return coin;
		}
		
		if(solutions.containsKey(coin)){
			return solutions.get(coin);
		}
		
		long coinSum = solution(Math.floorDiv(coin,2)) +solution(Math.floorDiv(coin,3)) +solution(Math.floorDiv(coin,4));
		if(coinSum>coin){
			solution = coinSum;
		}
		solutions.put(coin, solution);
		return solution;
	}
	
	
	
}
