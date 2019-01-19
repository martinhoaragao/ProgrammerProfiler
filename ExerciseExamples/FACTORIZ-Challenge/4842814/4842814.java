import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
		
	@SuppressWarnings("rawtypes")
	static abstract class Q<T extends Number> implements Comparable<Q> {
		int id;
		private ArrayList<T> sol;
		T rest;
		int currentSieved;
		public Q(int id) {
			this.id=id;
			this.currentSieved = 0;
			sol = new ArrayList<T>();
		}
		abstract void checkRest();
		abstract void init(String s, int trailingZeros);
		boolean sieveNext(int times){
			for(int t=1;t<=times;t++){
				if(!this.sieveNext())return false;
			}
			return true;
		}
		abstract boolean sieveNext();
		void add(T obj){
			this.sol.add(obj);
		}
		int size(){
			return this.sol.size();
		}
		@Override
		public int compareTo(Q o) { // we're only interested in the size
			return this.size() >= o.size() ? -1 : 1;
		}
	}
	static class QBig extends Q<BigInteger> {
		public QBig(int id) {
			super(id);
		}
		@Override
		void checkRest() {
			if(rest.compareTo(BigInteger.ONE) > 0){
				this.add(rest);
				rest = BigInteger.ONE;
			}
		}
		@Override
		void init(String s, int trailingZeros) {
			this.rest = new BigInteger(s.substring(0,s.length()-trailingZeros));
			while(trailingZeros-->0){
				this.add(BigInteger.valueOf(2));
				this.add(BigInteger.valueOf(5));
			}
		}
		@Override
		boolean sieveNext() {
			if(this.currentSieved >= SEARCH_TILL_NTH_PRIME)
				return false;
			BigInteger[] div = this.rest.divideAndRemainder(biprimes[this.currentSieved]);
			if(div[1].equals(BigInteger.ZERO)){
				while(div[1].equals(BigInteger.ZERO)){
					this.add(biprimes[this.currentSieved]);
					this.rest = div[0];
					div = this.rest.divideAndRemainder(biprimes[this.currentSieved]);
				}
				if(this.rest.compareTo(BI_MAXLONG) < 0) 
					todo[current] = new QBigWrap(this); // use the "faster" small variant
			}
			this.currentSieved++;
			return true;
		}
	}
	static class QBigWrap extends QSmall {
		private QBig qb;
		public QBigWrap(QBig qb) {
			super(qb.id);
			this.qb = qb;
			this.currentSieved = qb.currentSieved;
			this.rest = qb.rest.longValue();
		}
		@Override
		void add(Long obj) {
			qb.add(BigInteger.valueOf(obj));
		}
	}
	static class QSmall extends Q<Long> {
		public QSmall(int id) {
			super(id);
		}
		@Override
		void checkRest() {
			if(rest > 1){
				this.add(rest);
				rest = 1L;
			}
		}
		@Override
		void init(String s, int trailingZeros) {
			this.rest = Long.parseLong(s.substring(0,s.length()-trailingZeros));
			while(trailingZeros-->0){
				this.add(2L);
				this.add(5L);
			}
			if(this.isPrimeOrOne())
				this.currentSieved = primes.length;
		}
		@Override
		boolean sieveNext(){
			if(this.currentSieved >= SEARCH_TILL_NTH_PRIME || primesPow[this.currentSieved] > this.rest)return false;
			if(this.rest%primes[this.currentSieved] == 0){
				this.add(primes[this.currentSieved]);
				this.rest /= primes[this.currentSieved];
				while(this.rest%primes[this.currentSieved]==0){
					this.add(primes[this.currentSieved]);
					this.rest /= primes[this.currentSieved];
				}
				if(this.isPrimeOrOne()){
					this.currentSieved = primes.length;
					return false;
				}
			}
			this.currentSieved++;
			return true;
		}
		private boolean isPrimeOrOne(){
			return this.rest <= 1 || (this.rest < CALC_PRIMES && !hasdiv[this.rest.intValue()]);
		}
	}
	
	// FACTORIZ
	static final int SEARCH_TILL_NTH_PRIME = 14000, 
			FIRST_CHECK_COUNT = 90,
			INIT_GOOD_RANGE = 10, 
			CALC_PRIMES = 200000;
	static final BigInteger BI_MAXLONG = BigInteger.valueOf(Long.MAX_VALUE);
	static final long TOTAL_TIME = 5450;
	static long start, end; // start time of program
	static int T, current; // cases left
	@SuppressWarnings("rawtypes")
	static Q[] qs, todo;
	public static void main(String[] args) throws Exception {
		final InputReader in = new InputReader(System.in);
		final OutputWriter out = new OutputWriter(System.out);
		start = System.currentTimeMillis();
		end = start+TOTAL_TIME;
		getPrimes(CALC_PRIMES);
		System.err.println("Time: "+(System.currentTimeMillis()-start)+" ms");
		T = in.readInt();
		qs = new Q[T];
		todo = new Q[T];
		for(int t=0;t<T;t++){
			String s = in.readString();
			int trailingZero = 0;
			for(int i=s.length()-1;i>=0;i--){
				if(s.charAt(i)!='0')break;
				trailingZero++;
			}
			if(s.length()-trailingZero < 18){
				qs[t] = new QSmall(t);
			}else{
				qs[t] = new QBig(t);
			}
			qs[t].init(s,trailingZero);
			todo[current] = qs[t];
			if(todo[current].sieveNext(FIRST_CHECK_COUNT))
				current++;
		}
		int max_left = current;
		Arrays.sort(todo,0,max_left); // assume that at least one will still need to improve
		int next = INIT_GOOD_RANGE;
		int left = Math.min(max_left-1, next);
		while(left > 0 && checkTime()){
			for(current=0;current<left;){
				if(todo[current].sieveNext()){
					current++;
				}else{
					if(next < max_left){
						todo[current]=todo[next++];
						current++;
					}
					else{
						todo[current]=todo[--left];
					}
				}
			}
		}
//		if(checkTime()){
//			throw new RuntimeException("There is more to explore :o");
//		}
		int score = 0;
		for(int t=0;t<T;t++){
			qs[t].checkRest();
			score+=(qs[t].size()*qs[t].size());
			out.printLine(qs[t].size());
			for(Object o : qs[t].sol){
				out.printLine(o);
			}
		}
		System.err.println("Time: "+(System.currentTimeMillis()-start)+" ms");
		System.err.println("Score: "+score+" over "+T+" cases");
		out.close();
	}
	
	// returns true if testCase can go on
	static boolean checkTime(){
		return (end > System.currentTimeMillis());
	}
	
	static long[] primes, primesPow;
	static BigInteger[] biprimes;
	static boolean[] hasdiv;
	static void getPrimes(int n)
    {
		int max = (int)Math.sqrt(n);
        hasdiv = new boolean[n + 1];
        int count = 1, p, q;
        for (p=3;p<=n;p+=2)
        {
            if (!hasdiv[p])
            {
            	count++;
            	if(p>max)continue;
            	q=p*p;
            	while(q <= n){
            		hasdiv[q]=true;
            		q+=(p+p);
            	}
            }
        }
        primes = new long[count];
		primesPow = new long[count];
		biprimes = new BigInteger[count];
		primes[0]=2;primesPow[0]=4;biprimes[0]=BigInteger.valueOf(2);
        for (p=3,q=1;p<=n;p+=2){
        	if(hasdiv[p])continue;
			primes[q] = p;
			biprimes[q]= BigInteger.valueOf(p);
			primesPow[q] = 1L*p*p;
			q++;
		}
        //System.err.println("Count: "+count);
    }
	
	
	static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String readLine() {
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

		public String readString() {
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

		public long readLong() {
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

		public int readInt() {
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

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}

	static class OutputWriter {
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					outputStream)));
		}

		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0)
					writer.print(' ');
				writer.print(objects[i]);
			}
		}

		public void printLine(Object... objects) {
			print(objects);
			writer.println();
		}

		public void close() {
			writer.close();
		}
	}
}