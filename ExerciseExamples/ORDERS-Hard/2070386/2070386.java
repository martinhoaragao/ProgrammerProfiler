import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

//0- based indexable skip list.
class IndexableSkipList<E extends Comparable<E>> {	

	private class SkipNode {
		E value;
		int level;
		int length;
		SkipNode next;
		SkipNode down;

		public SkipNode(E val, int lvl, int ps, SkipNode nxt, SkipNode dwn) {
			value = val;
			level = lvl;
			length = ps;
			next = nxt;
			down = dwn;
		}
	}

	final static double p = 0.5;
	SkipNode head;
	Random r;
	int size;
	int next_pos;

	public IndexableSkipList() {
		head = new SkipNode(null, 0, -1, null, null);
		r = new Random();
		size = 0;
		next_pos = 0;
	}

	public int randomizeLevel() {
		int level = 0;
		while (level <= head.level && r.nextDouble() < p)
			++level;
		return level;
	}
	
	public E removeElement(int index){
		if (index < 0 || index >= size)
			return null;
		E removed = null;
		int cur_pos = -1;
		SkipNode cur = head;		
		while (cur != null) {
			if (cur.next != null && cur_pos + cur.length < index) {
				cur_pos += cur.length;
				cur = cur.next;
			} else {
				cur.length--;
				if(cur_pos + cur.length + 1 == index && cur.next != null){				
					removed = cur.next.value;
					cur.length += (cur.next.length == -1 ? 0 : cur.next.length);
					cur.next = cur.next.next;					
				}
				cur = cur.down;
			}
		}
		--size;
		if(size == 0){			
			head = new SkipNode(null, 0, -1, null, null);
		}
		return removed;
	}

	public boolean addElement(E val, int index) {
		if (index < 0 || index > size)
			return false;
		int level = randomizeLevel();
		if (level > head.level) {
			head = new SkipNode(null, level, index, null, head);
		}		
		int cur_pos = -1;
		SkipNode cur = head;
		SkipNode last = null;
		while (cur != null) {
			if (cur.next != null && cur_pos + cur.length < index) {
				cur_pos += cur.length;
				cur = cur.next;
			} else {
				cur.length++;
				if (level >= cur.level) {
					SkipNode toAdd = new SkipNode(val, cur.level, 0, cur.next, null);					
					if(last != null)
						last.down = toAdd;
					cur.next = toAdd;
					last = toAdd;
					toAdd.length = cur.length - (index - cur_pos);
					cur.length = index - cur_pos;
				}
				cur = cur.down;
			}
		}
		++size;
		return true;
	}

	public E getElementAtIndex(int index) {
		if (index < 0 || index >= size)
			return null;
		SkipNode cur = head;
		int cur_pos = -1;
		while (cur != null) {
			if (cur_pos == index)
				return cur.value;
			if (cur.next == null || cur_pos + cur.length > index) {
				cur = cur.down;
				continue;
			} else {
				cur_pos += cur.length;
				cur = cur.next;
			}
		}
		return null;
	}

	public void print() {
		SkipNode cur = head;
		SkipNode first = head;
		while (first != null) {
			cur = first;
			System.out.print(first.level + " ");
			while (cur != null) {
				System.out.print("[" + cur.value + " " + cur.length + "] ");
				cur = cur.next;
			}
			System.out.println();
			first = first.down;
		}
	}
	
	public int [] printForCase(int n){
		SkipNode lowest_level = head;
		while(lowest_level.down != null)
			lowest_level = lowest_level.down;
		int [] ans = new int [n];
		SkipNode begin = lowest_level.next;
		int rank = 1;
		while(begin != null){
			int soldier = Integer.parseInt(begin.value.toString());
			ans[soldier] = rank++;
			begin = begin.next;
		}
		return ans;
	}
}

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static StringTokenizer st = new StringTokenizer("");
	static int nextInt() throws Exception {
		return Integer.parseInt(next());
	}
	static String next() throws Exception {
		while (true) {
			if (st.hasMoreTokens()) {
				return st.nextToken();
			}
			String s = br.readLine();
			if (s == null) {
				return null;
			}
			st = new StringTokenizer(s);
		}
	}
	
	public static void main(String[] args)throws Exception {
		PrintWriter out = new PrintWriter(System.out);
		int cases = nextInt();
		IndexableSkipList<Integer> list;		
		while(cases-- > 0){
			list = new IndexableSkipList<Integer>();
			int n = nextInt();		
			for(int i = 0 ; i < n ; ++i){
				int displacement = nextInt();
				int newPos = i - displacement;				
				list.addElement(i, newPos);
			}
			int [] ans = list.printForCase(n);
			for(int soldierRank : ans)
				out.print(soldierRank + " ");
			out.println();			
		}
		out.flush();
	}
	
}
