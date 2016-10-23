import java.util.Scanner;
import java.util.ArrayList;

public class ex3 {
 public static void leN(String[] args) {
 Scanner input = new Scanner(System.in);
 
     ArrayList<Integer> lista = new ArrayList<Integer>();
     int par=0;

     System.out.println("Digite o numero de elementos desejado: ");
            int n = input.nextInt();
   
     for(int i=0; i<n;i++){
            System.out.println("Digite um numero: ");
            int numero = input.nextInt();
            lista.add(numero);
        }
     
    for(int i = 0; i < lista.size(); i++){
      if(lista.get(i) % 2 == 0){    
      par++;
      }
    }

     System.out.println("Total de numeros pares : "+ par);

     
 }
}