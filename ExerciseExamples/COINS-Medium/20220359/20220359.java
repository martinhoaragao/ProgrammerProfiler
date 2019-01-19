import java.util.*;
 class coins {
 
	static int MAXN = 10000001;
	static long ans[] = new long[MAXN];
	static {
		
		for(int i=0;i<12;i++) {
			ans[i] = i;
		}
		
		for(int i=12;i<MAXN;i++) {
			ans[i] = (ans[i/2]+ans[i/3]+ans[i/4]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		while(sc.hasNext()) {
			tmp = sc.nextInt();
			System.out.println(rec(tmp));
		}
	}
	
	public static long rec(int x) {
		if(x<MAXN)
			return ans[x];
		
		return rec(x/2) + rec(x/3)+ rec(x/4);
	}
}