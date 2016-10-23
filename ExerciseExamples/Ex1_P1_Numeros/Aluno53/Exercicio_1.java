import java.util.Scanner;
public class Exercicio_1
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pares=0;
        int impares=0;
        int somapares=0;
        int numero;
        double mediapares;
        while(true){
            System.out.print("Número: ");
            numero = scan.nextInt();
            if(numero==0) break;
            else{
                if((numero%2)==0){
                    pares++;
                    somapares += numero;
                }
                else{
                    impares++;
                }
            }
        }
        mediapares = (double)somapares/pares;
        System.out.println(pares+" numeros pares!");
        System.out.println(impares+" numeros impares!");
        if(pares>0)System.out.println("A média dos números pares é "+mediapares+"!");
    }
}
