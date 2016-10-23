import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
     ArrayList<Integer> idades = new ArrayList<Integer>();
     int total = 0, n=10, m=18, listNum[], i;

     float media;
   
     for(i=0; i<n;i++){
            System.out.println("Digite a idade: ");
            int idade = input.nextInt();
            idades.add(idade);
            total += idade;
        }
     
    for(i = 0; i < idades.size(); i++){
      if(idades.get(i)>m){    
      System.out.println("Idade a cima de "+ m+ ": " + idades.get(i));
      }
    }

     media = total / n;

     System.out.println("Idades lidas: "+ n);
     System.out.println("Total: "+ total);
     System.out.println("Media: "+ media);

     
 }
}