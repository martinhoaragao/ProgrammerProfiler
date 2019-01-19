
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCases; i++) {
      int numberOfSoldiers = Integer.parseInt(br.readLine());
      List<Integer> result = new ArrayList<Integer>(numberOfSoldiers);
      QuiteLimitedArray left = new QuiteLimitedArray(numberOfSoldiers);
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < numberOfSoldiers; j++) {
        result.add(Integer.parseInt(st.nextToken()));
      }
      // Transform!
      for (int j = numberOfSoldiers - 1; j >= 0; j--) {
        int index = j - result.get(j);
        result.set(j, left.removeIndex(index) + 1);
      }
      System.out
          .println(result.stream().map(j -> Integer.toString(j)).collect(Collectors.joining(" ")));
    }
  }
}


class QuiteLimitedArray {
  private final int internal[];
  private final int rootLevel;

  /** Initializes the array with integers 0..(length-1). */
  QuiteLimitedArray(int length) {
    this.internal = new int[length * 2];
    int height = 32 - Integer.numberOfLeadingZeros(length - 1);
    if (height > 0) {
      this.rootLevel = 1 << (height - 1);
    } else {
      this.rootLevel = 1;
    }
  }

  private int removeIndexFromTree(int treeOffset, int level, int index) {
    if (level == 1) {
      if (index == 0) {
        if (this.internal[treeOffset] == 0) {
          this.internal[treeOffset] = 1;
          return 0;
        } else {
          return 1;
        }
      } else {
        return 1;
      }
    } else {
      int splitter = level - this.internal[treeOffset];
      if (index < splitter) {
        // go left
        int removed = this.removeIndexFromTree((treeOffset << 1) + 1, level >> 1, index);
        this.internal[treeOffset]++;
        return removed;
      } else {
        // go right
        int removed = this.removeIndexFromTree((treeOffset << 1) + 2, level >> 1, index - splitter);
        return removed + level;
      }
    }
  }

  /**
   * O(log n). Returns the value currently present at the given index, and removes it from the
   * array.
   */
  int removeIndex(int index) {
    return this.removeIndexFromTree(0, this.rootLevel, index);
  }
}
