import java.util.Scanner;

class TREEROOT
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
    
        for (int i = 0; i < cases; i++)
        {
            int root = 0;
            int numNodes = in.nextInt();
            
            for (int j = 0; j < numNodes; j++)
            {
                root += in.nextInt();
                root -= in.nextInt();
            }
            
            System.out.println(root);
        }
    }
}
