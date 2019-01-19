
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prode
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < n; i++) {
            String linha = input.nextLine();
            int count = 0;
            for(int j = 0; j < linha.length(); j++) {
                if(linha.charAt(j)=='A'||linha.charAt(j)=='D'||linha.charAt(j)=='P'||linha.charAt(j)=='R'||linha.charAt(j)=='O'||linha.charAt(j)=='B'||linha.charAt(j)=='Q')count++;
                if(linha.charAt(j)=='B')count++;
            }
            System.out.println(count);
        }
        
    }
    
}
