import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

/*		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("output.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream is = fis;
		OutputStream os = fos;*/
		InputStream is = System.in;
		OutputStream os = System.out;
		readInput(is, os);
/*		try {
			fis.close();
			fos.close();
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("output2.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		is = fis;
		os = fos;
//		is = System.in;
//		os = System.out;
		readInput2(is, os);*/
		
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
//		System.out.println("Time taken (ms): " + timeTaken);
	}

	private static void readInput(InputStream is, OutputStream os) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader(is), 80*1024);
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(os), 80*1024);
			int t = Integer.parseInt(br.readLine());
			for (int i = 0; i < t; i++) {
				int m = Integer.parseInt(br.readLine());
				String[] strarr = br.readLine().split(" ");
				MRBT<Integer, Integer> st =  new MRBT<Integer, Integer>();
				for (int j = 0; j < m; j++) {
					int index = j - Integer.parseInt(strarr[j]);
					st.insertAt(index, j, null);
				}
				Queue<Integer> queue = (Queue<Integer>) st.inOrder();
				int[] ranks = new int[m];
				for (int j = 0; j < m; j++) {
					int position = queue.poll();
					ranks[position] = j+1;
				}
				for (int j = 0; j < m; j++) {
					bw.write(Integer.toString(ranks[j]));
					if (j != m-1) bw.write(" ");
				}
				bw.newLine();
			}
			bw.close();
		} catch ( Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void readInput2(InputStream is, OutputStream os) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader(is), 80*1024);
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(os), 80*1024);
			int t = Integer.parseInt(br.readLine());
			for ( int i = 0; i < t; i++ ) {
				int m = Integer.parseInt(br.readLine());
				String[] strarr = br.readLine().split(" ");
				List<ONode> ol = new LinkedList<ONode>();
				List<ONode> ll = new LinkedList<ONode>();
				Iterator<ONode> itr = null;
				for ( int j = 0; j < m; j++ ) {
					ONode ONode = new ONode(j, Integer.parseInt(strarr[j]));
					ol.add(ONode);
					ll.add(ONode.position - ONode.moves, ONode);
				}
				int j = 0;
				itr = ll.iterator();
				while ( itr.hasNext() ) {
					j++;
					itr.next().rank = j;
				}
				itr = ol.iterator();
				while ( j > 0 ) {
					bw.write(Integer.toString((itr.next().rank)));
					if ( itr.hasNext() )
						bw.write(" ");
					else
						break;
				}
				bw.newLine();
			}
			bw.close();
		} catch ( Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static class ONode {
		public int position;
		public int rank;
		public int moves;
		
		public ONode ( int position, int moves ) {
			this.position = position;
			this.moves = moves;
		}
	}
}

final class MRBT<Key extends Comparable<Key>, Value> {

    protected Node root;             // root of BST

    protected class Node {
        protected Key key;           // sorted by key
        protected Value val;         // associated data
        protected Node left, right, parent;  // left and right subtrees
        protected int N;             // number of nodes in subtree
        protected Color color;

        public Node(Key key, Value val, int N, Color color) {
            this.key = key;
            this.val = val;
            this.N = N;
            this.color = color;
        }
    }
    
    protected enum Color {
    	RED, BLACK;
    }

    // return number of key-value pairs in BST
    public int size() {
        return size(root);
    }

    // return number of key-value pairs in BST rooted at x
    protected int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }
    
	/*
	 * Ignores key ordering 
	 * and inserts (key,value) pair at the
	 * specified index, moving forward 
	 * the existing node at it
	 */
	public void insertAt(int index, Key key, Value val) {
		Node x = new Node(key, val, 1, Color.RED);
		root = insertAt(index, root, x);
		balance(x);
	}

	protected Node insertAt(int index, Node current, Node x) {
		if (current == null) {
			return x;
		} else {
			int t = size(current.left);
			x.parent = current;
			if ( index <= t ) {
				current.left = insertAt(index, current.left, x);
			} else {
				current.right = insertAt(index-t-1, current.right, x);
			}
			current.N = current.N + 1;
			return current;
		}
	}
	
	public Node grandparent(Node x) {
		if (x != null && x.parent != null)
			return x.parent.parent;
		else
			return null;
	}
	
	public Node uncle(Node x) {
		Node g = grandparent(x);
		if (g == null)
			return null;
		if (g.left == x.parent)
			return g.right;
		else
			return g.left;
	}
	
	public void rotate_left(Node x) {
		Node r = x;	// root
		Node p = x.right; // pivot
		r.right = p.left;
		if (r.right != null) r.right.parent = r;
		r.N = 1 + size(r.left) + size(r.right);
		p.parent = r.parent;
		p.left = r;
		p.N = 1 + size(p.left) + size(p.right);
		if (r.parent != null && r.parent.left == r) r.parent.left = p;
		else if (r.parent != null) r.parent.right = p;
		else root = p;
		r.parent = p;
	}
	
	public void rotate_right(Node x) {
		Node r = x;
		Node p = x.left; // pivot
		r.left = p.right;
		if (r.left != null) r.left.parent = r;
		r.N = 1 + size(r.left) + size(r.right);
		p.parent = r.parent;
		p.right = r;
		p.N = 1 + size(p.left) + size(p.right);
		if (r.parent != null && r.parent.left == r) r.parent.left = p;
		else if (r.parent != null) r.parent.right = p;
		else root = p;
		r.parent = p;
	}
	
	private void balance(Node x) {
		if (x == null) return;
		insert_case1(x);
	}
	
	private void insert_case1(Node x) {
		if (x.parent == null)
			x.color = Color.BLACK;
		else
			insert_case2(x);
	}
	
	private void insert_case2(Node x) {
		if (x.parent.color == Color.BLACK)
			return;
		else
			insert_case3(x);
	}
	
	private void insert_case3(Node x) {
		Node u = uncle(x);
		if (u != null && u.color == Color.RED) {
			x.parent.color = Color.BLACK;
			u.color = Color.BLACK;
			Node g = grandparent(x);
			g.color = Color.RED;
			insert_case1(g);
		} else {
			insert_case4(x);
		}
	}
	
	private void insert_case4(Node x) {
		Node g = grandparent(x);
		if (x == x.parent.right && x.parent == g.left) {
			rotate_left(x.parent);
			x = x.left;
		} else if (x == x.parent.left && x.parent == g.right) {
			rotate_right(x.parent);
			x = x.right;
		}
		insert_case5(x);
	}
	
	private void insert_case5(Node x) {
		Node g = grandparent(x);
		x.parent.color = Color.BLACK;
		g.color = Color.RED;
		if (x == x.parent.left)
			rotate_right(g);
		else
			rotate_left(g);
	}
	
	public Iterable<Key> inOrder() {
        Queue<Key> queue = new LinkedList<Key>();
        inOrder(root, queue);
        return queue;
    }
	
	public void inOrder(Node x, Queue<Key> queue) {
		if (x == null) return;
		if (x.left != null) inOrder(x.left, queue);
		queue.add(x.key);
		if (x.right != null) inOrder(x.right, queue);
	}
}