import java.util.*;
class LifeProblem{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            num = sc.nextInt();
            if(num==42)break;
            else
            System.out.println(num);
        }
        sc.close();
    }
}