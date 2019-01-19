/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class ATM{
    public static void main(String[] args)throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split(" ");
        int mywithdrawal = Integer.parseInt(arr[0]);
        double mybalance = Double.parseDouble(arr[1]);
        if(mybalance > 0 && mybalance <=2000){
            if(mywithdrawal>0 && mywithdrawal<=2000){
                if(mywithdrawal%5 == 0 && mywithdrawal<=(Double)mybalance && ((Double)mybalance-mywithdrawal-0.50)>=0){
                    if(mywithdrawal<mybalance){
                        double result = (double)(mybalance-mywithdrawal-0.50);
                        System.out.println(result);
                    }else{
                        double result = mybalance;
                        System.out.println(result);
                    }
                }else{
                    double result = mybalance;
                    System.out.println(result);
                }
            }else{
                double result = mybalance;
                System.out.println(result);
            }   
        }
    }
}
