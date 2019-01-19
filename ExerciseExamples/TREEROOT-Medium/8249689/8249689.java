import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;


class Solution 
{
	public static void main(String[] args) {
		new Solution().solve();		
	}
	PrintWriter out;

	//long mod=1000000007L ;
	public void solve()
	{

		out=new PrintWriter(System.out);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			int c1=0;
			int c2=0;
			for(int j=0;j<n;j++)
			{
				c1+=in.nextInt();
				c2+=in.nextInt();
			}
			System.out.println(c1-c2);
		}
		out.close();
	}
	
	public long ncr(int n,int r)
	{
		if(r>n/2)
		{
			r=n-r;
		}
		long ans=1L;
		for(int i=0;i<r;i++)
		{
			ans*=n-i;
			ans/=i+1;
		}
		return ans;
	}
	
	public class  ss implements Comparable<ss>
	{
		int val;
		int freq;
		public ss(int v,int f)
		{
			this.val=v;
			this.freq=f;
		}
		@Override
		public int compareTo(ss o) {

			return Integer.compare(this.val, o.val);
		}

		public boolean equals(Object o)
		{
			if(o==null)
			{
				return false;
			}
			else
			{ 
				ss oo=(ss) o;
				if(this.val==oo.val)
				{
					return true;
				}
			}
			return false;
		}
	}



	public class UF {

		private int[] parent;  // parent[i] = parent of i
		private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
		private int count;   
		int[] seg;
		int max;
		// number of components
		public UF(int N) {
			if (N < 0) throw new IllegalArgumentException();
			count = N;
			parent = new int[N];
			rank = new byte[N];
			seg=new int[N];
			for (int i = 0; i < N; i++) {
				parent[i] = i;
				rank[i] = 0;
				seg[i]=1;
			}
			max=1;
		}

		public int find(int p) {
			if (p < 0 || p >= parent.length) throw new IndexOutOfBoundsException();
			while (p != parent[p]) {
				parent[p] = parent[parent[p]];    // path compression by halving
				p = parent[p];
			}
			return p;
		}

		public int count() {
			return count;
		}

		public boolean connected(int p, int q) {
			return find(p) == find(q);
		}

		public boolean union(int p, int q) {
			//	System.out.println("uf "+p+" "+q);
			int rootP = find(p);
			int rootQ = find(q);
			if (rootP == rootQ) return false;

			// make root of smaller rank point to root of larger rank
			if      (rank[rootP] < rank[rootQ])
			{
				parent[rootP] = rootQ;
				seg[rootQ]+=seg[rootP];
				max=Math.max(seg[rootQ],max);
			}
			else if (rank[rootP] > rank[rootQ])
			{
				parent[rootQ] = rootP;
				seg[rootP]+=seg[rootQ];
				max=Math.max(seg[rootP],max);
			}
			else {
				parent[rootQ] = rootP;
				rank[rootP]++;
				seg[rootP]+=seg[rootQ];
				max=Math.max(seg[rootP],max);
			}
			count--;
			return true;
		}

	}


	class segTree
	{
		//	int N =(int) 1e5; // limit for array size
		int n;  // array size
		long[] sum;

		public segTree(long[] arr)
		{
			n=arr.length;
			sum=new long[3*n];
			for(int i=0;i<arr.length;i++)
			{
				sum[i+n]=arr[i];
			}
			build();
			//			for(int i=0;i<2*arr.length;i++)
			//			{
			//				System.out.print(max[i]+" ");
			//			}
			//			System.out.println();
			//			for(int i=0;i<2*arr.length;i++)
			//			{
			//				System.out.print(count[i]+" ");
			//			}
			//	System.out.println(Arrays.toString(max)+" "+Arrays.toString(count));
		}
		void build() {  // build the tree
			for (int i = n - 1; i > 0; --i)
			{
				if(sum[i<<1]!=sum[i<<1|1])
				{
					sum[i] =sum[i<<1] | sum[i<<1|1];
				}
				else
				{
					sum[i]=sum[i<<1];
				}
			}
		}

		void modify(int p, int value) {  // set value at position p
			for (sum[p += n] = value; p > 1; p >>= 1) sum[p>>1] = sum[p] | sum[p^1];
		}

		long query(int l, int r) {  // sum on interval [l, r)
			//	System.out.println(Arrays.toString(sum)+" "+l+" "+ r);
			long ans=0L;
			for (l += n, r += n; l < r; l >>= 1, r >>= 1) {
				if ((l&1)!=0)
				{
					ans|=sum[l];
					l++;
				}
				if ((r&1)!=0)
				{
					--r;
					ans|=sum[r];
				}
			}
			return ans;
		}
	}

	class qq implements Comparable<qq>
	{
		long sqrn;
		int l,r;
		int idx;
		public qq(int idx,int l,int r)
		{
			this.l=l;
			this.idx=idx;
			this.r=r;
		}

		@Override
		public int compareTo(qq o) {
			// TODO Auto-generated method stub
			if(this.l/sqrn==o.l/sqrn)
			{
				return Integer.compare(this.r, o.r);
			}
			else
			{
				return Integer.compare(this.l,o.l);
			}		
		}

		public String toString()
		{
			return "{ "+this.idx+" "+this.l+" "+this.r+" }";
		}

	}

	//	public void add(int x)
	//	{
	//		System.out.println("Add "+x);
	//		count[arr[x]]++;
	//		if(count[arr[x]]==c)
	//		{
	//			for(int i=0;i<3;i++)
	//			{
	//				if(s[i]==-1)
	//				{
	//					answer++;
	//					s[i]=arr[x];
	//					break;
	//				}
	//			}
	//		}
	//		else if(count[arr[x]]>c)
	//		{
	//			if(s[0]!=arr[x] && s[1]!=arr[x] && s[2]!=arr[x])
	//			{
	//				for(int i=0;i<3;i++)
	//				{
	//					if(s[i]==-1)
	//					{
	//						answer++;
	//						s[i]=arr[x];
	//						break;
	//					}
	//				}
	//			}
	//		}
	//	for(int i=0;i<10;i++)
	//	{
	//		System.out.print(count[i]+" ");
	//	}
	//	System.out.println();
	//		System.out.println(answer);
	//	}
	//	
	//	public void remove(int x)
	//	{
	//		count[arr[x]]--;
	//		System.out.println("remove " +x);
	//		if(count[arr[x]]==c-1)
	//		{
	//			for(int i=0;i<3;i++)
	//			{
	//				if(s[i]==arr[x])
	//				{
	//					answer--;
	//					s[i]=-1;
	//					break;
	//				}
	//			}
	//		}
	//		else if(count[arr[x]]>c)
	//		{
	//			if(s[0]!=arr[x] && s[1]!=arr[x] && s[2]!=arr[x])
	//			{
	//				for(int i=0;i<3;i++)
	//				{
	//					if(s[i]==-1)
	//					{
	//						answer++;
	//						s[i]=arr[x];
	//						break;
	//					}
	//				}
	//			}
	//		}
	//		for(int i=0;i<10;i++)
	//		{
	//			System.out.print(count[i]+" ");
	//		}
	//		System.out.println();
	//		System.out.println(answer);
	//	}



	//		
	//		long pow(long a,int n,long m)
	//		{
	//			if(n==1)
	//				return a;
	//			if(n==0)
	//				return 1;
	//			long ans=pow(a,n/2,m);
	//			ans*=ans;
	//			ans%=m;
	//			if(n%2!=0)
	//				ans*=a;
	//			ans%=m;
	//			return ans;
	//		}

















	public static int gcd(long a, long b) {
		BigInteger b1 = BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger gcd = b1.gcd(b2);
		return gcd.intValue();
	}



	FasterScanner in=new FasterScanner();

	public static class FasterScanner {
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = System.in.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}
} 
