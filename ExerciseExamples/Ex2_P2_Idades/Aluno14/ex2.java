import java.util.Scanner;
import java.util.ArrayList;

public class ex2{
    
    public static void main(String argv[]){
        inputIdades();
    }
    
    /* Utilizar array */
    public static void inputIdades(){
        Scanner s = new Scanner(System.in);
        int idade,numero,input;
        System.out.print("Idade de referência: ");
        idade = Math.abs(s.nextInt());
        System.out.print("Número de idades a ler: ");
        numero = Math.abs(s.nextInt());
        
        ArrayList<Integer> array_idades = new ArrayList<Integer>();
        
        for(int i=0;i<numero;i++){
            input = Math.abs(s.nextInt());
            if(input >= idade){
                array_idades.add(input);
            }
        }
       
        for(int i: array_idades){
            System.out.print(i + " ");
        }
        
    }
}