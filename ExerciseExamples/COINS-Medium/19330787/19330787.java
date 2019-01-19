import java.util.Scanner;

class COINS
{
    static long findSolution(int i)
    {
        if (i < 12)
        {
            return i;
        }
        else if (i/2 + i/3 + i/4 > i)
        {
            return Math.max(i/2, findSolution(i/2)) + Math.max(i/3, findSolution(i/3)) + 
                   Math.max(i/4, findSolution(i/4));
        }
        return i;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int input = in.nextInt();
            long answer = findSolution(input);
            System.out.println(answer);
            in.nextLine();
        }
        in.close();
    }
}