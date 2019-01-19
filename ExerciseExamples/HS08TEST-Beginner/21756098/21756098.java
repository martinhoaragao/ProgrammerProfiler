/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krutarth
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int withdraw = sc.nextInt();
        double total = sc.nextFloat();
        
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);
        total = bd.doubleValue();
        
        if((withdraw % 5)!=0 || withdraw > total || withdraw<0){
            System.out.println(total);
        }
        else{
            if(total - (withdraw + 0.5)>0){
                total = total - (withdraw + 0.5);
                System.out.println(total);
            }
            else 
                System.out.println(total);
        }
    }
}
