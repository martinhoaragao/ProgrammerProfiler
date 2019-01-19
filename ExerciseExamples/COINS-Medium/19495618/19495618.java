import java.util.Scanner;
class Solution{

public static int[] memory = new int[500000];
	public static long t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long a = sc.nextLong();

			System.out.println(calculate(a));
		}
	}

	public static long calculate(long x) {
		if (x < 500000) 
			if (memory[(int)x] != 0) 
				return memory[(int)x];
			
		

		if ((x / 2) + (x / 3) + (x / 4) <= x) 
			return x;
		

		else {
			long t = calculate(x / 2) + calculate(x / 3) + calculate(x / 4);
			if (x < 500000) {
				memory[(int)x] = (int)t;
				
			}
			return t;
		}


	}
}