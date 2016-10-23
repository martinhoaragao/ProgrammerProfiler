

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Ficha8
{

    public static void Exercicio1(){
        
        int read = -1;
        Scanner s = new Scanner(System.in);
        System.out.println("-- Exercicio 1 --");
        
        while (read != 0){
            read = s.nextInt();
            if(read>0) {
                Ex1.adicionaNumero(read);
            }
        }

        System.out.println("Total Pares: " + Ex1.nPares);
        System.out.println("Total Impares: " + Ex1.nImpares);
        System.out.println("Média Pares: " + Ex1.mediaPares());
    }
  


  
}
