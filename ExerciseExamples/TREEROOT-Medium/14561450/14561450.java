
import java.io.*;
import java.util.*;


/*
 * kishan Thesiya
 * daiict
 * kishanthesiya25@gmail.com
 * 
 * 
 */


class Main {
	FastScanner in;
	PrintWriter out;

	static ArrayList[] adj;
	static int n;
	static int x;
	static int visited[];
	static int Ad[];
	static int Bd[];
	
	class Item implements Comparable<Item> {
		int num;
		int val;
		
		public Item(int num, int val) {
			super();
			this.num = num;
			this.val = val;
		}

		@Override
		public int compareTo(Item arg0) {
			return Integer.compare(val, arg0.val);
		}
	}
	
    void solve() {
    	
    	int t = in.nextInt();
    	
    	for(int i = 0;i<t;i++){
    		int n = in.nextInt();
    		
    		int id= 0;
    		int sum = 0;
    		
    		for(int j = 0;j<n;j++){
    			id += in.nextInt();
    			sum += in.nextInt();
    		}
    		
    		System.out.println(id-sum);
    	}
    }
    
    public static long sum(long x){
    	return x<10?x:x%10 + sum(x/10);
    }
	
	public static long gcd(long x, long y) {
		if (x == 0)
			return y;
		else
			return gcd( y % x,x);
	}
	public static long pow(long n,long p,long m){
        long  result = 1;
         if(p==0)
           return 1;
       if (p==1)
           return n;
       while(p!=0)
       {
           if(p%2==1)
               result *= n;
           if(result>=m)
           result%=m;
           p >>=1;
           n*=n;
           if(n>=m)
           n%=m;
       }
       return result;
       }
	
	
	
	public static boolean isPrime(int n) {
		// Corner cases
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
 
		// This is checked so that we can skip 
		// middle five numbers in below loop
		if (n % 2 == 0 || n % 3 == 0)
			return false;
 
		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
 
		return true;
	}
	

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
	class Tri{
		
		Tri[] arr;
		
		public Tri(){
			arr = new Tri[27];
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}
}