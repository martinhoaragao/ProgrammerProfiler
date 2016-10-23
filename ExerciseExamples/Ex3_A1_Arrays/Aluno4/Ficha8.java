

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Ficha8
{
    
    public static void Exercicio3(){
       
       Random rand = new Random();
       Scanner s = new Scanner(System.in);
       System.out.println("-- Exercicio 3 --");
       System.out.println("-- N --");
       int n = s.nextInt();
       int[] array = Ex3.criaVector(n);
       
       for(int i=0; i<n; i++) array[i] = rand.nextInt(10001);
       
       System.out.println("Nrº Pares no Array:" + Ex3.filtraPares(array));
    }
    
    
    
    
    
}
