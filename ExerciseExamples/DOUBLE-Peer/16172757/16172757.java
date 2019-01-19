
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paras
 */
class P {
    
    
    public static void main(String args[]){
    
        Scanner in=new Scanner(System.in);
        
        int t=in.nextInt();
        
        while(t-->0){
        
            int n=in.nextInt();
            
            if(n%2==0)
                System.out.println(n);
            else
                System.out.println(n-1);
        }
    }
    
}
