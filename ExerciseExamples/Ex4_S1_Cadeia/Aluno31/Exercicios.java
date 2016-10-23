import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class Exercicios
{
   public static void ex4(String str,String substr){
    int indexF=0;
    int countStr = 0;
    while(indexF != -1){
    indexF = str.indexOf(substr,indexF);
    if(indexF != -1){
        countStr ++;
        indexF += substr.length();
    }   
    }
    System.out.println("Número de repetições de "+"'"+substr+"'"+ " em "+"'"+str+"'"+" : "+ countStr);
    }
    
    
}