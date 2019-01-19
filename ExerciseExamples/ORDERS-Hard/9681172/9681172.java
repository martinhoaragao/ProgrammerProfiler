import java.util.*;
 
public class Main {
  static class Node {
    int steps;
    int position;
    int rightChilds = 0;
    Node left = null;
    Node right = null;
    Node(int steps, int position) {
      this.steps = steps;
      this.position = position;
    }
  }
  static class Tree {
    Node root = null;
    int size = 0;
    void add(int steps) {
      Node toBeAdded = new Node(steps, size++);
      add(toBeAdded);
    }
    void add(Node toBeAdded) {
      if (root == null) {
        root = toBeAdded;
        return;
      }
      Node cur = root;
      for (;;) {
        int steps = cur.rightChilds + 1;
        if (steps <= toBeAdded.steps) {
          toBeAdded.steps -= steps;
          if (cur.left == null) {
            cur.left = toBeAdded;
            return;
          }
          cur = cur.left;
        } else {
          cur.rightChilds += 1;
          if (cur.right == null) {
            cur.right = toBeAdded;
            return;
          }
          cur = cur.right;
        }
      }
    }
    int[] getRanks() {
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
          ranks[node.position] = ++rank;
          node = node.right;
        }
      }
      return ranks;
    }
  }
  public static void main(String argv[]) {
    answer();
    //test(new int[]{0, 1, 2, 0, 1});
  }
  public static void answer() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; ++i) {
      Tree tree = new Tree();
      int n = sc.nextInt();
      for (int j = 0; j < n; ++j) {
        tree.add(sc.nextInt());
      }
      int[] ranks = tree.getRanks();
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < n - 1; ++j) {
        sb.append(ranks[j] + " ");
      }
      sb.append(ranks[n - 1]);
      System.out.println(sb.toString());
    }
  }
  public static void test(int[] steps) {
    Tree tree = new Tree();
    for (int step : steps) {
      tree.add(step);
    }
    System.out.println(Arrays.toString(tree.getRanks()));
  }
}