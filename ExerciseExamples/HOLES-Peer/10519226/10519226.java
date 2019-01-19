
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Long.max;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priyendu
 */
class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
	int t = Integer.parseInt(br.readLine());
	while(t--> 0){
            int holes=0;
            String a=br.readLine();
            for(int i=0;i<a.length();i++){
                switch(a.charAt(i)){
                    case 'A':
                    case 'D':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                        holes++;
                        break;
                    case 'B':
                        holes+=2;
                        break;
                }
            }
            pw.println(holes);
            pw.flush(); 
        }
           
    }
    
}
