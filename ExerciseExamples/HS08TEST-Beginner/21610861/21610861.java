/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/**
 *
 * @author HP
 */
class HS08TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double res;
        double sub = x + 0.50;

        if (x % 5 != 0 || sub > y) {
            res = y;
        }
        else {
            res = y - sub;    
        }
        System.out.printf("%.2f\n",res);
    }

}