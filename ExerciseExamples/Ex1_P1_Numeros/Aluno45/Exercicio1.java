import java.util.*;

public class Exercicio1
{
    public static void main (String [] args) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner ler = new Scanner (System.in);
        System.out.println("Introduza os números: ");
        int num;
        num=ler.nextInt();
        
        while(num!=0){
            if(num % 2 == 0) {
                pares.add(num);
            }
            else { impares.add(num); }
            num=ler.nextInt();
        }
        
        System.out.println("Quantidade de números pares: " + pares.size());
        System.out.println("Quantidade de números impares: " + impares.size());
        
        int soma=0;
        for(Integer i : pares) {
            soma=soma+i;
        }
        
        System.out.println("A média dos números pares é: " + soma/pares.size());
    }
}
    