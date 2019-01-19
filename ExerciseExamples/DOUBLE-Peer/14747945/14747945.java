import java.util.Scanner;

/**
 * Created by Yash Jain on 1/8/17.
 * This file is a part of PACKAGE_NAME of OOPMLab.
 */
public class Main {
    public static void main(String Args[])
    {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        for (int i=0;i<tc;i++)
        {
            int temp = scan.nextInt();
            if(temp%2==0) System.out.println(temp);
            else System.out.println(temp-1);
        }
    }
}
