
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
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
class Practise {
    
    public static void main(String args[]){
    
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
        
            int n=in.nextInt();
            int suma=0,sumb=0;
            for(int i=0;i<n;i++){
            
                suma+=in.nextInt();
                sumb+=in.nextInt();
            }
            System.out.println(suma-sumb);
        }
    }
}