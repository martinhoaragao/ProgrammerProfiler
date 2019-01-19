/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author kendry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca = new Scanner(System.in);
        int testcase = sca.nextInt();
        while (testcase-- > 0) {
            int n = sca.nextInt();
            int count = 0;
            while (n-- > 0) {
                count += sca.nextInt() - sca.nextInt();

            }
            System.out.println(count);
        }

    }

}
