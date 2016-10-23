

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique a cadeia: ");
        String str1 = sc.nextLine();
        System.out.println("Indique a sub-cadeia a procurar: ");
        String str2 = sc.nextLine();
        String aux = new String();
        int i=0,tam = str1.length(), pos, conta=0;
        while(i!=tam){
            if(str1.contains(str2)){
                pos = str1.indexOf(str2); 
                str1=str1.substring(pos+1,str1.length());
                i=0;
                conta++;
            }
            i++; 
        }
        System.out.println("Existem "+conta);
    }
    
}
