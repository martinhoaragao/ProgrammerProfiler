/** Team Proof
 * AVL Tree Integeralized implementation
 */

import java.util.*;
import java.io.*;

class AVLTree
{
	class node
	{
		int data;
		int NumberInSubtree;
		int height;

		node left, right, parent;
		boolean isLeft, isLeaf;

		node (int t)
		{
			data = t;
			NumberInSubtree = 1;
			isLeaf = false;
			left = new node(this);
			right = new node(this);
		}

		node (node p)
		{
			data = 1<<31;
			NumberInSubtree = 0;
			isLeaf = true;
			parent = p;
		}
	}

	node root;
	int size;

	AVLTree ()
	{
		node dummy = null;
		root = new node(dummy);
		size = 0;
	}

	node find(int val)
	{
		node curr = root;
		while(!curr.isLeaf)
		{
			int c = val - curr.data;
			if(c == 0)
				return curr;	//found
			else if(c < 0)
			{
				curr = curr.left;
			}
			else curr = curr.right;
		}
		return null;	//cannot find
	}

	void rotate(node curr, boolean left)	// if left is true, then it brings the left node to the curr, and sends curr down right
	{
		if(left)
		{
			node tmp = curr.left;
			node t1 = tmp.left;
			node t2 = tmp.right;
			node t3 = curr.right;


			//link tmp with parent
			tmp.parent = curr.parent;
			tmp.isLeft = curr.isLeft;
			if(tmp.parent != null)
				if(tmp.isLeft)
					tmp.parent.left = tmp;
				else
					tmp.parent.right = tmp;
				else
					root = tmp;

			tmp.right = curr;
			curr.parent = tmp;
			curr.isLeft = false;

			curr.left = t2;
			t2.parent = curr;
			t2.isLeft = true;

			curr.NumberInSubtree = 1 + t2.NumberInSubtree + t3.NumberInSubtree;
			curr.height = 1 + Math.max(t2.height, t3.height);

			tmp.NumberInSubtree = 1 + t1.NumberInSubtree + curr.NumberInSubtree;
			tmp.height = 1 + Math.max(curr.height, t1.height);
		}
		else
		{
			node tmp = curr.right;
			node t1 = curr.left;
			node t2 = tmp.left;
			node t3 = tmp.right;


			//link tmp with parent
			tmp.parent = curr.parent;
			tmp.isLeft = curr.isLeft;
			if(tmp.parent != null)
				if(tmp.isLeft)
					tmp.parent.left = tmp;
				else
					tmp.parent.right = tmp;
				else
					root = tmp;

			tmp.left = curr;
			curr.parent = tmp;
			curr.isLeft = true;

			curr.right = t2;
			t2.parent = curr;
			t2.isLeft = false;

			curr.NumberInSubtree = 1 + t1.NumberInSubtree + t2.NumberInSubtree;
			curr.height = 1 + Math.max(t2.height, t1.height);

			tmp.NumberInSubtree = 1 + t3.NumberInSubtree + curr.NumberInSubtree;
			tmp.height = 1 + Math.max(curr.height, t3.height);
		}
	}

	int size()
	{
		return size;
	}
	
	node add(int val)
	{
		size ++;
		if(root.isLeaf)
		{
			root = new node(val);
			return root;
		}
		
		node curr = root;

		int c;
		while(!curr.isLeaf)
		{
			c = val - curr.data;
			if(c < 0)
			{
				if(!curr.left.isLeaf)
					curr = curr.left;
				else break;
			}
			else
			{
				if(!curr.right.isLeaf)
					curr = curr.right;
				else break;
			}
		}
		node tmp = new node(val);
		c = val - curr.data;
		if(c < 0)
		{
			tmp.parent = curr;
			curr.left = tmp;
			tmp.isLeft = true;
		}
		else
		{
			tmp.parent = curr;
			curr.right = tmp;
			tmp.isLeft = false;
		}
		node ret = tmp;

		while (tmp!= null)
		{
			tmp.NumberInSubtree = 1+ tmp.left.NumberInSubtree + tmp.right.NumberInSubtree;
			tmp.height = 1 + Math.max(tmp.left.height, tmp.right.height);
			if(tmp.left.height > tmp.right.height + 1)
			{
				node tmp1 = tmp.left;
				if(tmp1.left.height > tmp1.right.height)
				{
					rotate(tmp, true);
				}
				else
				{
					rotate(tmp1, false);
					rotate(tmp, true);
				}
			}
			else if(tmp.right.height > tmp.left.height + 1)
			{
				node tmp1 = tmp.right;
				if(tmp1.left.height > tmp1.right.height)
				{
					rotate(tmp1, true);
					rotate(tmp, false);
				}
				else
					rotate(tmp, false);
			}

			tmp = tmp.parent;
		}
		return ret;
	}

	boolean del(int val)		//returns true if val was there in the tree, in which case deleted
	{
		node curr = find(val);
		if(curr == null)
			return false;

		node start;
		if(curr.left.isLeaf)
		{
			if(curr.right.isLeaf)
			{
				if(curr.parent == null)
				{
					node dummy=null;
					root=new node(dummy);
					size=0;
				}
				else
				{
					if(curr.isLeft)
						curr.parent.left = new node(curr.parent);
					else
						curr.parent.right = new node(curr.parent);
				}

				start = curr.parent;
			}
			else
			{
				node tmp = curr.right;
				tmp.parent = curr.parent;
				tmp.isLeft = curr.isLeft;
				if(tmp.parent != null)
					if(tmp.isLeft)
						tmp.parent.left = tmp;
					else
						tmp.parent.right = tmp;
					else
						root = tmp;

				start = tmp.parent;
			}
		}
		else
		{
			if(curr.right.isLeaf)
			{
				node tmp = curr.left;
				tmp.parent = curr.parent;
				tmp.isLeft = curr.isLeft;
				if(tmp.parent != null)
					if(tmp.isLeft)
						tmp.parent.left = tmp;
					else
						tmp.parent.right = tmp;
					else
						root = tmp;

				start = tmp.parent;
			}
			else
			{
				node inorderleft = curr.left;
				while(!inorderleft.right.isLeaf)
					inorderleft = inorderleft.right;

				curr.data = inorderleft.data;

				node curr1 = inorderleft;
				node tmp1 = inorderleft.left;
				tmp1.parent = curr1.parent;
				tmp1.isLeft = curr1.isLeft;
				if(tmp1.isLeft)
					tmp1.parent.left = tmp1;
				else
					tmp1.parent.right = tmp1;

				start = tmp1.parent;
			}
		}

		while(start != null)
		{
			start.height = 1 + Math.max(start.left.height, start.right.height);
			start.NumberInSubtree = 1 + start.left.NumberInSubtree + start.right.NumberInSubtree;

			node tmp = start;
			if(tmp.left.height > tmp.right.height + 1)
			{
				node tmp1 = tmp.left;
				if(tmp1.left.height > tmp1.right.height)
				{
					rotate(tmp, true);
				}
				else
				{
					rotate(tmp1, false);
					rotate(tmp, true);
				}
			}
			else if(tmp.right.height > tmp.left.height + 1)
			{
				node tmp1 = tmp.right;
				if(tmp1.left.height > tmp1.right.height)
				{
					rotate(tmp1, true);
					rotate(tmp, false);
				}
				else
					rotate(tmp, false);
			}

			start = start.parent;
		}
		size --;
		return true;
	}

	/** TODO:
	 RETURN LOWER_BOUND RANK OF ELEMENT VAL			"DONE"
	 RETURN UPPER_BOUND RANK OF ELEMNET VAL
	 FIND ELEMENT WITH RANK R
	 COUNT NUMBER OF ELEMENTS WITH DATA < VAL		DONE
	 */
	int lowerboundRank(int val)	//returns number of elements < val
	{
		int ret = 0;
		node curr = root;
		int c;
		while(!curr.isLeaf)
		{
			c = val - curr.data;
			if(c <= 0)
				curr = curr.left;
			else
			{
				ret += 1 + curr.left.NumberInSubtree;
				curr = curr.right;
			}
		}
		return ret;
	}

	int upperboundRank(int val)	//returns number of elements <= val.
	{
		int ret = 0;
		node curr = root;
		int c;
		while(!curr.isLeaf)
		{
			c = val - curr.data;
			if(c < 0)
				curr = curr.left;
			else
			{
				ret += 1 + curr.left.NumberInSubtree;
				curr = curr.right;
			}
		}
		return ret;
	}
	
	int findAtRank(int rank)	//return value at 0-indexed sorted list of numbers
	{
		node curr = root;
		while(!curr.isLeaf)
		{
			int lt=curr.left.NumberInSubtree;
			if(rank<lt)
				curr=curr.left;
			else if(rank==lt)
				return curr.data;
			else
			{
				rank-=(lt+1);
				curr=curr.right;
			}
		}
		return -1;
	}
		
}

public class Main
{
	void debug(Object...os)
	{
		System.out.println(Arrays.deepToString(os));
	}
	
	public static void main(String [] args) throws Exception
	{
		new Main().execute();
	}

	Parser pr=new Parser(System.in);
	PrintWriter out=new PrintWriter(System.out);
	int T;
	int N;
	int[] shift;

	void execute() throws Exception
	{
		T = pr.ni();
		for(int testnum=0;testnum<T;testnum++)
		{
			input();
			solve();
		}
		out.flush();
	}
	
	void input() throws Exception
	{
		N = pr.ni();
		shift=new int[N];
		for(int i=0;i<N;i++)
			shift[i]=pr.ni();
	}
		
	AVLTree tree;
	
	void solve() throws IOException
	{
		
		tree = new AVLTree();
		
		for(int i=1;i<=N;i++)
			tree.add(i);
		
		int[] ranks=new int[N];
		for(int i=N-1;i>=0;i--)
		{
			int z=tree.findAtRank(i-shift[i]);
			ranks[i]=z;
			tree.del(z);
		}
		
		for(int i=0;i<N;i++)
			out.print(ranks[i]+" ");
		out.println();

	}
}


class Parser
{
   final private int BUFFER_SIZE = 1 << 16;

   private DataInputStream din;
   private byte[] buffer;
   private int bufferPointer, bytesRead;

   public Parser(InputStream in)
   {
	  din = new DataInputStream(in);
	  buffer = new byte[BUFFER_SIZE];
	  bufferPointer = bytesRead = 0;
   }

   public int ni() throws Exception
   {
	  int ret = 0;
	  byte c = read();
	  while (c <= ' ') c = read();
	  boolean neg = c == '-';
	  if (neg) c = read();
	  do
	  {
		 ret = ret * 10 + c - '0';
		 c = read();
	  } while (c > ' ');
	  if (neg) return -ret;
	  return ret;
   }

   public long nl() throws Exception
   {
	  long ret = 0;
	  byte c = read();
	  while (c <= ' ') c = read();
	  boolean neg = c == '-';
	  if (neg) c = read();
	  do
	  {
		 ret = ret * 10 + c - '0';
		 c = read();
	  } while (c > ' ');
	  if (neg) return -ret;
	  return ret;
   }
   
   public String ns() throws Exception
   {
	  StringBuffer ret=new StringBuffer();
	  byte c = read();
	  while (c <= ' ') c = read();
	  do
	  {
		 ret = ret.append((char)c);
		 c = read();
	  } while (c > ' ');
	  return ret.toString();
   }	   
   
   private void fillBuffer() throws Exception
   {
	  bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	  if (bytesRead == -1) buffer[0] = -1;
   }

   private byte read() throws Exception
   {
	  if (bufferPointer == bytesRead) fillBuffer();
	  return buffer[bufferPointer++];
   }
}