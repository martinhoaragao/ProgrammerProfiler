import java.io.*;
import java.util.*;
import java.math.*;
public class Main
{
  BigInteger TWOBI = BigInteger.ONE.add(BigInteger.ONE);
  BigDecimal TWOD = BigDecimal.ONE.add(BigDecimal.ONE);
  public static void main(String[] args) throws Exception
  {
    new Main();
  }
  MyReader in;
  PrintStream out;

  public Main() throws Exception
  {
    // String file = "soldiers";
    // in = new MyReader(new BufferedReader(new FileReader(file + ".in")));
    // out = new PrintStream(file + ".out");
    in = new MyReader(new BufferedReader(new InputStreamReader(System.in)));
    out = System.out;
    int cases = in.nextInt();
    for (int caseNum =0; caseNum<cases;caseNum++)
    {
      int n = in.nextInt();
      solve(n);
    } // cases
    out.flush();
    out.close();
  }
  public void solve(int n) throws IOException
  {
    Node root = new Node(in.nextInt());
    // build structure
    for (int i=1; i < n; i++) {
      Node node = new Node(i);
      int weight = in.nextInt();
      root.insert(node, weight);
    }
    // read back
    int rank = 1;
    int[] solution = new int[n];
    for (Node node: root) {
      solution[node.index] = rank++;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(solution[0]);
    for (int i=1;i<n;i++) {
      sb.append(" ");
      sb.append(solution[i]);
    }
    out.println(sb.toString());
    out.flush();
  }
  Node successor(Node node){
    if (node == null)
      return null;
    else if (node.right != null) {
      Node p = node.right;
      while (p.left != null) {
        p = p.left;
      }
      return p;
    } else {
      Node p = node.parent;
      Node ch = node;
      while (p != null && ch == p.right) {
        ch = p;
        p = p.parent;
      }
      return p;
    }
  }
  Node getFirst(Node root) {
    if (root == null) return null;
    Node p = root;
    // Go to actual root
    while (p.parent != null) {
      p = p.parent;
    }
    // go to far left child
    while (p.left != null) {
      p = p.left;
    }
    return p;
  }
  public class Node implements Iterable<Node>
  {
    public class MyIterator implements Iterator<Node>
    {
      Node next;
      public MyIterator(Node someNode)
      {
        next = getFirst(someNode);
      }
      @Override
      public boolean hasNext()
      {
        return next != null;
      }
      @Override
      public Node next()
      {
        Node toRet = next;
        next = successor(next);
        return toRet;
      }
      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    }
    Node left = null;
    Node right = null;
    Node parent = null;
    int index;
    int size;
    public Node(int i)
    {
      size = 1;
      index = i;
    }
    @Override
    public Iterator<Node> iterator()
    {
      return new MyIterator(this);
    }
    void insert(Node node, int amount)
    {
      int rsize = right == null ? 0 : right.size;
      if (amount == 0) {
        Node par = this;
        while (par.right != null) {
          par.size++;
          par = par.right;
        }
        par.right = node;
        node.parent = par;
        par.size++;
      } else if (amount == size) {
        Node par = this;
        while (par.left != null) {
          par.size++;
          par = par.left;
        }
        par.left = node;
        node.parent = par;
        par.size++;
      } else if (rsize+1 <= amount) {
        size++;
        if (left == null) {
          left = node;
          node.parent = this;
        } else {
          left.insert(node, amount - (rsize + 1));
        }
      } else {
        size++;
        if (right == null) {
          right = node;
          node.parent = this;
        } else { 
          right.insert(node, amount);
        }
      }
    }
  }

  static class MyReader {
    public MyReader(BufferedReader input) {
      in = input;
      eat("");
    }    
    private StringTokenizer st;
    private BufferedReader in;    
    void eat(String s) {
      st = new StringTokenizer(s);
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
  } // myreader
}