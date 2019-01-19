import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;


class PositionalTree
{
    private final int  n;
    private final Node root;

    public PositionalTree(final int n)
    {
        this.n = n;
        this.root = new Node(n);
        createTree(n, root);
    }

    private void createTree(final int n, final Node cur)
    {
        if (n < 1)
        {
            throw new RuntimeException("Error n is less than 1");
        }

        if (n == 1)
        {
            cur.setLeft(null);
            cur.setRight(null);
            return;
        }

        int leftVal = n / 2;
        Node leftTree = new Node(leftVal);
        createTree(leftVal, leftTree);
        cur.setLeft(leftTree);

        int rightVal = n - leftVal;
        Node rightTree = new Node(rightVal);
        createTree(rightVal, rightTree);
        cur.setRight(rightTree);
    }

    public int remove(final int idx)
    {
        if (idx > root.getVal())
        {
            throw new RuntimeException("Error : searched index is greator than available indexes");
        }
        return remove(idx, root);
    }

    public int remove(final int idx, final Node tree)
    {
        tree.decrVal();
        if (tree.getLeft() == null)
        {
            return 1;
        }
        int leftVal = tree.getLeft().getVal();
        if (idx > leftVal)
        {
            return tree.getLeft().getPos() + remove(idx - leftVal, tree.getRight());
        }
        else
        {
            return remove(idx, tree.getLeft());
        }
    }

    class Node
    {
        private final int pos;
        private int       val;
        private Node      left;
        private Node      right;

        public Node(final int val)
        {
            this.val = val;
            this.pos = val;
        }

        public int getPos()
        {
            return pos;
        }

        public int getVal()
        {
            return val;
        }

        public void incrVal()
        {
            val++;
        }

        public void decrVal()
        {
            val--;
        }

        public Node getLeft()
        {
            return left;
        }

        public void setLeft(final Node left)
        {
            this.left = left;
        }

        public Node getRight()
        {
            return right;
        }

        public void setRight(final Node right)
        {
            this.right = right;
        }
    }
}

/**
 * @author Udit Poddar (udit.poddar@inmobi.com)
 */
class ORDERS
{
    int                          n;
    int[]                        moved;
    int[]                        orig;
    private final PositionalTree segTree;

    public ORDERS(final int n, final int[] moved)
    {
        this.n = n;
        this.moved = moved;
        this.orig = new int[n];
        this.segTree = new PositionalTree(n);
    }

    public int[] getOriginalPosition()
    {
        for (int i = n - 1; i >= 0; i--)
        {
            int expextedPos = i + 1 - moved[i];
            orig[i] = segTree.remove(expextedPos);
        }
        return orig;
    }
}

class Scanf
{
    private final Scanner sc;

    public Scanf()
    {
        this(System.in);
    }

    public Scanf(final InputStream in)
    {
        this.sc = new Scanner(new BufferedInputStream(in));
    }

    public int readInt()
    {
        return sc.nextInt();
    }
}

class Printf
{
    private final BufferedWriter bw;

    public Printf()
    {
        this(System.out);
    }

    public void finalise() throws IOException
    {
        bw.flush();
    }

    public Printf(final PrintStream out)
    {
        this.bw = new BufferedWriter(new OutputStreamWriter(out));
    }

    public Printf writeInt(final int val) throws IOException
    {
        bw.write(String.valueOf(val));
        return this;
    }

    public Printf writeSpace() throws IOException
    {
        bw.write(" ");
        return this;
    }

    public Printf newLine() throws IOException
    {
        bw.write("\n");
        return this;
    }
}

/**
 * @author Udit Poddar (udit.poddar@inmobi.com)
 */
public class Main
{
    public static void main(final String[] args) throws IOException
    {
        Scanf scanf = new Scanf();
        Printf printf = new Printf();
        int t = scanf.readInt();
        for (int i = 0; i < t; i++)
        {
            int n = scanf.readInt();
            int[] moved = new int[n];
            for (int j = 0; j < n; j++)
            {
                moved[j] = scanf.readInt();
            }
            ORDERS c = new ORDERS(n, moved);
            for (int p : c.getOriginalPosition())
            {
                printf.writeInt(p).writeSpace();
            }
            printf.newLine();
        }
        printf.finalise();
    }
}