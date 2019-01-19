/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aakash.holla
 */
public class Main {
    static long solve(int n){
        if(n<11)
            return n;
        return Math.max(n,solve(n/2)+solve(n/3)+solve(n/4));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(console.hasNext()) {
            int num = console.nextInt();
            System.out.println(solve(num));
        }
    }    
}