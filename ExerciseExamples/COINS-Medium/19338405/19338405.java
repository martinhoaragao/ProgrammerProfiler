import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*; 

// 	/** Class for buffered reading int and double values */
// class Reader {
// 	static BufferedReader reader;
// 	static StringTokenizer tokenizer;

// 	/** call this method to initialize reader for InputStream */
// 	static void init(InputStream input) {
// 		reader = new BufferedReader(
// 			new InputStreamReader(input) );
// 		tokenizer = new StringTokenizer("");
// 	}

// 	/** get next word */
// 	static String next() throws IOException {
// 		while ( ! tokenizer.hasMoreTokens() ) {
// 			tokenizer = new StringTokenizer(
// 				reader.readLine() );
// 		}
// 		return tokenizer.nextToken();
// 	}

// 	static int nextInt() throws IOException {
// 		return Integer.parseInt( next() );
// 	}

// 	static double nextDouble() throws IOException {
// 		return Double.parseDouble( next() );
// 	}

// 	static long nextLong() throws IOException {
// 		return Long.parseLong( next() );
// 	}
// }

// class Tnode
// {
// 	char ch;
// 	HashMap<Character, Tnode> next;
// 	Queue<Integer> exist;
// 	boolean end;

// 	Tnode(char ch)
// 	{
// 		ch = this.ch;
// 		next = new HashMap<Character, Tnode>();
// 		exist = new PriorityQueue<Integer>();
// 		end = false;
// 	}
// }

// class Ss
// {
// 	String a;
// 	int i;

// 	Ss(String a, int i)
// 	{
// 		this.a = a;
// 		this.i = i;
// 	}
// }

class test
{
	// static Tnode root = new Tnode((char)0);
	// static Ss[] a;

	// static void sortar(Ss ar[], int left, int right)
	// {
	// 	int middle;
	// 	if(left < right)
	// 	{
	// 		middle = (left + right)/2;
	// 		sortar(ar, left, middle);
	// 		sortar(ar , middle + 1, right);
	// 		merge_sort(ar, left, right, middle);
	// 	}
	// }
	// static void merge_sort(Ss[] ar, int left, int right, int middle)
	// {
	// 	int le = middle - left + 1;
	// 	int ri = right - middle;
	// 	Ss[] l = new Ss[le];
	// 	Ss[] r = new Ss[ri];

	// 	int a = 0, b = 0;
	// 	int c = left;

	// 	for(int i = 0; i < le; i++)
	// 		l[i] = ar[left + i];

	// 	for(int i = 0;i< ri;i++)
	// 		r[i] = ar[middle + i + 1];
	// 	while(a < le && b < ri)
	// 	{
	// 		if (l[a].a.compareTo(r[b].a) > 0)
	// 		{
	// 			ar[c] = r[b];
	// 			b++;
	// 		}
	// 		else
	// 		{
	// 			ar[c] = l[a];
	// 			a++;
	// 		}
	// 		c++;
	// 	}
	// 	while(a < le)
	// 	{
	// 		ar[c] = l[a];
	// 		a++;
	// 		c++;
	// 	}
	// 	while(b < ri)
	// 	{
	// 		ar[c] = r[b];
	// 		b++; c++;
	// 	}
	// }

	// public static void insert(String word, int sn)
	// {
	// 	Tnode ptr = root;

	// 	for(int i = 0; i < word.length(); i++)
	// 	{
	// 		HashMap<Character, Tnode> pnext = ptr.next;
	// 		char c = word.charAt(i);
	// 		if(!pnext.containsKey(c))
	// 			pnext.put(c, new Tnode(c));
	// 		ptr = pnext.get(c);
	// 		ptr.exist.add(sn);
	// 	}

	// 	ptr.end = true;
	// }

	// public static int alph(String word, int r)
	// {
	// 	Tnode ptr = root;

	// 	for(int i = 0; i < word.length(); i++)
	// 	{
	// 		HashMap<Character, Tnode> pnext = ptr.next;
	// 		char c = word.charAt(i);
	// 		if(!pnext.containsKey(c))
	// 			break;

	// 		ptr = pnext.get(c);
	// 	}

	// 	int z = ptr.exist.peek();
	// 	ArrayList<Integer> temp = new ArrayList<Integer>();

	// 	while(ptr.exist.peek() != null)
	// 	{
	// 		z = ptr.exist.poll();
	// 		temp.add(z);
	// 		if(a[z].i <= r)
	// 		{
	// 			ptr.exist.addAll(temp);
	// 			return z;
	// 		}
	// 	}

	// 	ptr.exist.addAll(temp);
	// 	return z;
	// }

	static HashMap<Long, Long> a = new HashMap<Long, Long>();

	public static long calc(long n)
	{
		if(n == 0)
			return 0;

		if(a.containsKey(n))
			return a.get(n);

		long x = calc(n/2) + calc(n/3) + calc(n/4);
		if(x > n)
			a.put(n, x);
		else
			a.put(n, n);
		return a.get(n);
	}

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);

		while(s.hasNextLong())
		{
			long x = s.nextLong();

			System.out.println(calc(x));
		}
	}
}