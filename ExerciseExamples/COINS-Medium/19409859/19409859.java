

import java.util.Scanner;
class Bytelandian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			long n = s.nextLong();
			Bytelandian obj = new Bytelandian();
			System.out.println(obj.ans(n));
			
		}

	}
	public long ans(long x){
		long sum = x/2+x/3+x/4;
		if(sum>x){
			return ans(x/2) + ans(x/4) + ans(x/3);
		}
		else
			return x;
	}

}
