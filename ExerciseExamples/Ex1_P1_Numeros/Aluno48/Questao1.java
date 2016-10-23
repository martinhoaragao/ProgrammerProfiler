

import java.util.*;
public class Questao1
{
    public static void main() {
        Scanner in = new Scanner(System.in);
        int num=1;
        int numimpar=0;
        int numpar=0;
        int total=0;
        int med=0;
        System.out.println("Novo número, ou 0 para sair\n");
        while((num= in.nextInt())!=0){
        System.out.println("Novo número, ou 0 para sair\n");
            if (num%2 == 1) numimpar++;
            else{
                total+=num;
                numpar++;
            }
        }
        System.out.println("Quantidade de números pares: "+numpar+
                           "\nMédia dos números pares: "+total/numpar+
                           "\nQuantidade de números impares: "+numimpar);
    }
}
