import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        Double initial_acc_bal = sc.nextDouble();
        Double amt_double=Double.valueOf(amt);
        
        if(amt%5==0){
            Double rem_amt=initial_acc_bal-amt_double-0.5;
            if(initial_acc_bal-amt_double>=0.5){
            System.out.printf("%.2f",rem_amt);}
            else{ 
                System.out.printf("%.2f",initial_acc_bal);}
        }
        else {
            System.out.printf("%.2f",initial_acc_bal);}
        }
}