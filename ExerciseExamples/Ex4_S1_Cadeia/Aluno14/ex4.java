import java.util.Scanner;
import java.lang.String;

public class ex4{
    
    public static void main(String[] argv){
        solucaoIdeal();
    }

    public static void solucaoIdeal(){
        int contador=0;
        Scanner s = new Scanner(System.in);
        String palavra, sub_palavra;
        
        System.out.println("Palavra: ");
        palavra = s.nextLine();

        System.out.println("Sub-Palavra: ");
        sub_palavra = s.nextLine();
        
        for(int i=0; i<=palavra.length()-sub_palavra.length();i++){
            if(palavra.substring(i,i+sub_palavra.length()).equals(sub_palavra)){
                contador++;
            }
        }
        
        System.out.println("Número de vezes: " + contador);
    }
}