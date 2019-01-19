import java.util.*;
 
public class Main {
  static class Node {
    int shift;
    int pos;
    int rightChilds = 0;
    Node left = null;
    Node right = null;
    Node(int shift, int pos) {
      this.shift = shift;
      this.pos = pos;
    }
  }
  static class Tree {
    Node root = null;
    int size = 0;
    void add(int shift) {
      Node newNode = new Node(shift, size++);
      add(newNode);
    }
    void add(Node newNode) {
      if (root == null) {
        root = newNode;
        return;
      }
      Node cur = root;
      for (;;) {
        int shift = cur.rightChilds + 1;
        if (shift <= newNode.shift) {
          newNode.shift -= shift;
          if (cur.left == null) {
            cur.left = newNode;
            return;
          }
          cur = cur.left;
        } else {
          cur.rightChilds += 1;
          if (cur.right == null) {
            cur.right = newNode;
            return;
          }
          cur = cur.right;
        }
      }
    }
    int[] Ranks() {
      int[] ranks = new int[size];
      int rank = 0;
      Stack<Node> nodes = new Stack<Node>();
      Node node = root;
      while (!nodes.isEmpty() || null != node) {
        if (null != node) {
          nodes.push(node);
          node = node.left;
        } else {
          node = nodes.pop();
          ranks[node.pos] = ++rank;
          node = node.right;
        }
      }
      return ranks;
    }
  }
  public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i = 0; i < t; ++i) {
      Tree tree = new Tree();
      int n = scan.nextInt();
      for (int j = 0; j < n; ++j) {
        tree.add(scan.nextInt());
      }
      int[] ranks = tree.Ranks();
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < n - 1; ++j) {
        sb.append(ranks[j] + " ");
      }
      sb.append(ranks[n - 1]);
      System.out.println(sb.toString());
    }
  }
  public static void test(int[] shift) {
    Tree tree = new Tree();
    for (int step : shift) {
      tree.add(step);
    }
    System.out.println(Arrays.toString(tree.Ranks()));
  }
} 
