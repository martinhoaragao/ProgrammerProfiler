
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Souravgpt
 */
class treeroot {
    public static void main(String[] args)
    {
        int t;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while ((t--)>0)
        {
            int total=0;
            int n=scan.nextInt();
            while ((n--)>0)
            {
                int a=scan.nextInt(),b=scan.nextInt();
                total+=(a-b);
            }
            System.out.println(total);
        }
    }
}
