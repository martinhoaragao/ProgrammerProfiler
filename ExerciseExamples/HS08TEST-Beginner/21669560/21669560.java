/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author ITE Account
 */
class ATM {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t>0&&t<=2000){
            double balance = sc.nextDouble();
            double bal = balance;
            if(balance>=0&&balance<=2000){
                if(t==balance)
                    System.out.printf("%.2f\n",balance);

                else if(t%5==0 && t<balance){
                    balance = balance-t;
                    double result = balance - 0.5;
                    if(result<0)
                        System.out.printf("%.2f\n",bal);
                    else
                        System.out.printf("%.2f\n",result);
                    
                }
                else {
                    System.out.printf("%.2f\n",balance);
                }
            }
        }  
    }
}
