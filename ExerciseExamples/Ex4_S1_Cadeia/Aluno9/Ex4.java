

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        
        System.out.println("Introduza uma cadeia de caracteres: ");
        String cad = sc.nextLine();
        
        System.out.println("Introduza uma sub-cadeia: ");
        String sub = sc.nextLine();
        
        String aux = new String();
        
        int i=0;
        while(i < cad.length()){
            if(cad.substring(i, i+sub.length()).contains(sub)){
                cnt++; 
            }
            i+=sub.length();
        }
        System.out.println(cnt + " sub-cadeias");
    }
    
}
