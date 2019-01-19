import java.io.*;
import java.util.*;

public class Main implements Runnable {
	
	private BufferedReader in;
	private PrintWriter out;
	private StringTokenizer st;

	static class Node {
		final static Random rnd = new Random();
		int x, y, size;
		Node l, r;
		
		Node(int x) {
			this.x = x;
			this.size = 1;
			this.y = rnd.nextInt();
		}
		
		void fix() {
			size = size(l) + size(r) + 1;
		}
	}

	public static int size(Node tree) {
		return tree == null ? 0 : tree.size;
	}
	
	public static Node insert(Node tree, Node newNode, int after) {
		if (tree == null || tree.y < newNode.y) {
			split(tree, newNode, after);
			newNode.fix();
			return newNode;
		}
		if (after > size(tree.r)) {
			tree.l = insert(tree.l, newNode, after - size(tree.r) - 1);
		} else {
			tree.r = insert(tree.r, newNode, after);
		}
		tree.fix();
		return tree;
	}
	
	public static void split(Node tree, Node to, int after) {
		if (tree == null) {
			to.l = to.r = null;
			return;
		}
		if (after > size(tree.r)) {
			split(tree.l, to, after - size(tree.r) - 1);
			tree.l = to.r;
			to.r = tree;
		} else {
			split(tree.r, to, after);
			tree.r = to.l;
			to.l = tree;
		}
		tree.fix();
	}

	private int dfs(Node tree, int[] ans, int i) {
		if (tree == null) {
			return i;
		}
		i = dfs(tree.l, ans, i);
		ans[tree.x] = i++;
		i = dfs(tree.r, ans, i);
		return i;
	}
	
	private void solve() throws IOException {
		int n = nextInt();
		Node tree = null;
		for (int i = 0; i < n; ++i) {
			tree = insert(tree, new Node(i), nextInt());
		}
		int[] ans = new int[n];
		dfs(tree, ans, 1);
		for (int i = 0; i < n; ++i) {
			out.print(ans[i] + " ");
		}
		out.println();
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			eat("");
			
			int tests = nextInt();
			for (int test = 0; test < tests; ++test) {
				solve();
			}
			
//			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	private void eat(String line) {
		st = new StringTokenizer(line);
	}
	
	String next() throws IOException {
		while (!st.hasMoreTokens()) {
			String line = in.readLine();
			if (line == null) {
				return null;
			}
			eat(line);
		}
		return st.nextToken();
	}
	
	int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	long nextLong() throws IOException {
		return Long.parseLong(next());
	}
	
	double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
