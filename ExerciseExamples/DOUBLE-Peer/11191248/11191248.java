/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kp
 */
import java.util.*;
 class Numgame {
     public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         int t=s.nextInt();
         while(t-->0){
             int a=s.nextInt();
             if(a%2==0)
                 System.out.println(a);
             else
                 System.out.println(a-1);
                 
         }
     }
    
}
