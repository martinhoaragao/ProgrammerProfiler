import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class InputReader {

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
	    res += c & 15;
	    c = read();
	} while (!isSpaceChar(c));
	return res * sgn;
    }

    public String next() {
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

    public static boolean isSpaceChar(int c) {
	return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

}

class OutputWriter {
    private PrintWriter writer;

    public OutputWriter(OutputStream stream) {
	writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
		stream)));
    }

    public OutputWriter(Writer writer) {
	this.writer = new PrintWriter(writer);
    }
    
    public void println(String str) {
	writer.println(str);
    }
    
    public void print(String str) {
	writer.print(str);
    }
    
    public void print(char c) {
	writer.print(c);
    }
    
    public void println(char c) {
	writer.println(c);
    }

    public void println(int x) {
	writer.println(x);
    }

    public void print(int x) {
	writer.print(x);
    }

    public void printSpace() {
	writer.print(" ");
    }

    public void close() {
	writer.close();
    }

}

class RankTree {
    
    int size, totSize;
    int arr[];
    
    public RankTree(int size) {
	this.size = size;
	this.totSize = size * 20;
	
	arr = new int[totSize];
    }
    
    public void build() {
	//System.out.println("Building tree for size "+size);
	build(0, 0, size-1);
    }
    
    int getMid(int start, int end) {
	return start + (end-start) / 2;
    }
    
    public void build(int node, int start, int end) {
	//System.out.println("Start =" + start + " end = " + end);
	if(start > end)
	    return;
	
	if(start == end) {
		arr[node] = 1;
		//System.out.println("Putting 1 at "+ n);
	    	return;
	}
	
	int mid = getMid(start, end);
	build(node*2+1, start, mid);
	build(node*2+2, mid+1, end);
	
	int left = arr[node*2+1];
	int right = arr[node*2+2];
	
	arr[node] = left+right;
	
	//System.out.println("Putting :" + (left+right) + " at " + node);
    }
    
    
    public int update(int node, int start, int end, int rank) {
	
	int val;
	if(start > end)
	    return 0;
	
	if(start == end) {
	    arr[node] = 0;
	    return start;
	}
	
	int left = arr[node*2+1];
	int mid = getMid(start, end);
	int right = arr[node*2+2];
	
	if(rank <= left) {
	    //System.out.println("Going left");
	    val = update(node*2+1, start, mid, rank);
	}
	else {
	    //System.out.println("Going right");
	    val = update(node*2+2, mid+1, end, rank - left);
	}
	
	arr[node] = arr[node*2+1]+arr[node*2+2];
	
	return val;
    }
}



public class Main {
    
    InputReader ir;
    OutputWriter ow;
    int T, N;
    int arr[] = new int[200000];
    int res[] = new int[200000];
    RankTree rTree;
    
    public void solve(int arr[], int n) {
	rTree = new RankTree(n);
	rTree.build();
	int place, rank;
	
	for(int i = n-1; i >= 0; i--) {
	    rank = i - arr[i] + 1;
	    place = rTree.update(0, 0, n-1, rank);
	    
	    //System.out.println("Got index " + place);
	    res[i] = place+1;
	}
    }
    
    public Main() {
	ir = new InputReader(System.in);
	ow = new OutputWriter(System.out);
	
	T = ir.nextInt();
	
	while(T-- > 0) {
	    N = ir.nextInt();
	    
	    for(int i = 0; i < N; i++) {
		arr[i] = ir.nextInt();
	    }
	    
	    solve(arr, N);
	    
	    for(int i = 0; i < N; i++) {
		ow.print(res[i]);
		ow.printSpace();
	    }
	    ow.println("");
	}
	ow.close();
    }
    
    public static void main(String args[]) {
	new Main();
    }
    
}