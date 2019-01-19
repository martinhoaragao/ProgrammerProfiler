import java.util.*;
import java.io.*;
public class Main
{   
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();
        for(int i = 0; i < cases; i++)
        {
            int length = in.nextInt();
            in.nextLine();
            int[] list = new int[length];
            for(int j = 0; j < list.length; j++)
            {
                list[j] = in.nextInt();
            }
            in.nextLine();
            int uJ = in.nextInt();
            int uJLength = list[uJ - 1];
            Arrays.sort(list);
            for(int k = 0; k < list.length; k++)
            {
                if(list[k] == uJLength)
                {
                    uJ = k + 1;
                }
            }
            System.out.println(uJ);
            if(i != cases - 1)
            {
                in.nextLine();
            }
        }
    }
}