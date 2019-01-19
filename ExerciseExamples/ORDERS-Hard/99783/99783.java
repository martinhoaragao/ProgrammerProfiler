import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static final int MAX = 200000;

	public static BufferedWriter out;

	public static void main(String[] args) throws Exception {
		out = new BufferedWriter(new OutputStreamWriter(System.out));
		List list = new List();
		MyInputStream input = new MyInputStream(System.in);
		int totalTestCases, ns, i;
		totalTestCases = input.getNextInt();
		while (totalTestCases-- > 0) {
			ns = input.getNextInt();
			list.reset(ns);
			for (i = 0; i < ns; i++) {
				list.add(i + 1 - input.getNextInt(), i);
			}
			list.print();
		}
		out.flush();
	}

	static class List {
		public static final int LL = 0;
		public static final int LR = 1;
		public static final int RL = 2;
		public static final int RR = 3;

		int size;

		private Node root;

		int pointer;

		int[] ranks = new int[MAX];

		public Node add(int pos, int num) {
			Node n = new Node(num, null, null, null);
			if (root == null) {
				root = n;
			} else {
				add(root, n, pos);
			}
			size++;
			return n;
		}

		public void reset(int ns) {
			root = null;
			size = 0;

		}

		public void print() throws IOException {
			pointer = 0;
			populate(root);
			for (int i = 0; i < pointer; i++) {
				out.append(ranks[i] + " ");
			}
			out.append("\n");
		}

		private void populate(Node n) {
			if (n == null)
				return;
			populate(n.left);
			// System.out.print((n.value + 1) + " ");
			ranks[n.value] = ++pointer;
			populate(n.right);
		}

		private int add(Node p, Node n, int pos) {
			int height = 1, pp = getPosition(p);
			if (pos == pp && p.left != null) {
				height = add(p.left, n, (size + 1));// Add at highest position
				// in left subtree
				p.lc++;
			} else if (pos <= pp) {
				if (p.left != null) {
					height = add(p.left, n, pos);
				} else {
					p.left = n;
					n.parent = p;
				}
				p.lc++;
			} else {
				if (p.right != null) {
					height = add(p.right, n, pos - pp);
				} else {
					p.right = n;
					n.parent = p;
				}
				p.rc++;
			}
			height = p.height = height >= p.height ? height + 1 : p.height;
			boolean fixed = fixNode(p);
			return fixed ? height - 1 : height;
		}

		private int getPosition(Node n) {
			return n.lc + 1;

		}

		private boolean fixNode(Node n) {
			int b1 = getBalanceFactor(n), b2;
			int r = 5;
			if (b1 < -1) {
				b2 = getBalanceFactor(n.left);
				if (b2 < 0)
					r = LL;
				else if (b2 > 0)
					r = LR;
				else
					throw new RuntimeException(
							"Parent balance factor is < -1; but left child balance factor is 0. Parent -> "
									+ n.value);
			} else if (b1 > 1) {
				b2 = getBalanceFactor(n.right);
				if (b2 < 0)
					r = RL;
				else if (b2 > 0)
					r = RR;
				else
					throw new RuntimeException(
							"Parent balance factor is > 1; but right child balance factor is 0. Parent -> "
									+ n.value);
			}
			switch (r) {
			case LL:
				rotateRight(n);
				break;
			case LR:
				rotateLeft(n.left);
				rotateRight(n);
				break;
			case RL:
				rotateRight(n.right);
				rotateLeft(n);
				break;
			case RR:
				rotateLeft(n);
				break;
			}
			return r != 5;
		}

		private int getBalanceFactor(Node n) {
			int hl = n.left == null ? 0 : n.left.height;
			int hr = n.right == null ? 0 : n.right.height;
			return hr - hl;
		}

		private void rotateLeft(Node n) {
			Node r = n.right;
			if (r != null) {
				updateHeightForLeftRotation(n);
				updateParentChild(n, r, true);
				n.right = r.left;
				r.left = n;
				if (n == root) {
					root = r;
				}
				updateLcRc(n);
				updateLcRc(r);

			}
		}

		private void updateHeightForRightRotation(Node n) {
			int hr = 0, hll = 0, hlr = 0; /*
											 * Left children of node -> left ->
											 * right
											 */
			Node t = n.right;
			if (t != null) {
				hr = t.height;
			}
			t = n.left;
			if (t.left != null) {
				hll = t.left.height;
			}
			if (t.right != null) {
				hlr = t.right.height;
			}
			n.height = (hr > hlr ? hr : hlr) + 1;
			t.height = (hll > n.height ? hll : n.height) + 1;
		}

		private void updateHeightForLeftRotation(Node n) {
			int hl = 0, hrr = 0, hrl = 0;
			Node t = n.left;
			if (t != null) {
				hl = t.height;
			}
			t = n.right;
			if (t.right != null) {
				hrr = t.right.height;
			}
			if (t.left != null) {
				hrl = t.left.height;
			}
			n.height = (hl > hrl ? hl : hrl) + 1;
			t.height = (hrr > n.height ? hrr : n.height) + 1;
		}

		private void rotateRight(Node n) {
			Node l = n.left;
			if (l != null) {
				updateHeightForRightRotation(n);
				updateParentChild(n, l, false);
				n.left = l.right;
				l.right = n;
				if (n == root) {
					root = l;
				}
				updateLcRc(n);
				updateLcRc(l);
			}
		}

		private void updateParentChild(Node n, Node lr, boolean leftRotation) {
			lr.parent = n.parent;
			if (n.parent != null) {
				if (n.parent.right == n) {
					n.parent.right = lr;
				} else {
					n.parent.left = lr;
				}
			}
			if (lr.left != null && leftRotation) {
				lr.left.parent = n;
			}
			if (lr.right != null && !leftRotation) {
				lr.right.parent = n;
			}
			n.parent = lr;
		}

		private void updateLcRc(Node n) {
			n.lc = getTotal(n.left);
			n.rc = getTotal(n.right);
		}

		private int getTotal(Node n) {
			return n != null ? n.lc + n.rc + 1 : 0;
		}

		public String toString() {
			int level = 0;
			StringBuilder stringBuilder = new StringBuilder(
					"Tree in right left: ");
			preOrder(root, stringBuilder, level);
			return stringBuilder.toString();
		}

		private void preOrder(Node n, StringBuilder stringBuilder, int level) {
			if (n != null) {
				stringBuilder.append("\n");
				for (int i = 0; i < level; i++)
					stringBuilder.append("\t");
				stringBuilder.append(n.toString());
				preOrder(n.right, stringBuilder, level + 1);
				preOrder(n.left, stringBuilder, level + 1);
			}
		}

		private void inOrder(Node n, ArrayList<Integer> list) {
			if (n != null) {
				inOrder(n.left, list);
				list.add(n.value);
				inOrder(n.right, list);
			}
		}

		public ArrayList<Integer> getElement() {
			ArrayList<Integer> list = new ArrayList<Integer>();
			inOrder(root, list);
			return list;
		}

		private void validate() {
			validateHeight();
			validateParent();
			validateLcRc();
		}

		private void validateLcRc() {
			validateLcRc(root);
		}

		private int validateLcRc(Node n) {
			if (n == null)
				return -1;
			int totalL = validateLcRc(n.left);
			if (n.lc != totalL + 1)
				throw new RuntimeException("Lc is not consistent");
			int totalR = validateLcRc(n.right);
			if (n.rc != totalR + 1)
				throw new RuntimeException("Rc is not consistent");
			return totalL + totalR + 2;
		}

		private void validateHeight() {
			validateHeight(root);
		}

		private int validateHeight(Node n) {
			if (n == null)
				return 0;
			int hl = validateHeight(n.left);
			int hr = validateHeight(n.right);
			int h = (hr > hl ? hr : hl) + 1;
			if (h != n.height) {
				throw new RuntimeException("Height is not consistent");
			}
			return h;
		}

		private void validateParent() {
			validateParent(root);
		}

		private void validateParent(Node n) {
			if (n == null)
				return;
			if (n.left != null && n.left.parent != n) {
				throw new RuntimeException(
						"Left node's parent is not consistent" + n.left);
			}
			if (n.right != null && n.right.parent != n) {
				throw new RuntimeException(
						"Right node's parent is not consistent" + n.right);
			}
			validateParent(n.left);
			validateParent(n.right);
		}

		static class Node {
			int value;
			Node left;
			Node right;
			Node parent;
			int height = 1;
			int lc = 0;
			int rc = 0;

			Node(int value, Node left, Node right, Node parent) {
				this.value = value;
				this.left = left;
				this.right = right;
				this.parent = parent;
			}

			public String toString() {
				return new StringBuilder().append(" [ ").append(value).append(
						", ").append(lc).append(" ] ").toString();
			}
		}
	}

	private static class MyInputStream {

		private static int BUFF_SIZE = 10 * 1024;
		private char[] buffer = new char[BUFF_SIZE];
		private int pointer;
		private BufferedReader br;
		int currentBufferSize;

		MyInputStream(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private void fillBuffer() throws Exception {
			if (pointer == currentBufferSize) {
				int a = br.read(buffer);
				if (a == -1) {
					throw new Exception("No more bytes to read");
				} else {
					currentBufferSize = a;
					pointer = 0;
				}
			}
		}

		private char getNextChar() throws Exception {
			fillBuffer();
			return buffer[pointer++];
		}

		public int getNextInt() throws Exception {
			int num = -1, ch;
			ch = getNextChar();
			while (ch < '0') {
				ch = getNextChar();
			}
			if (ch != -1) {
				num = 0;
				do {
					num = 10 * num + ch - '0';
					ch = getNextChar();
				} while (ch >= '0');
			}
			return num;
		}

	}

}
