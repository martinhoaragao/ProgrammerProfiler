import java.util.Scanner;

public class exc4
{
   String obtida;
    String teste;
    int nrVezes;
    
    public exc4(){
        obtida = new String();
        teste = new String();
    }
    
    public int contaRep(String cadeia, String sub){
        int rep = 0;
        int subLength = sub.length();
        String teste;
        
        if(!cadeia.contains(sub)) return 0;
        else {
            for(int index = 0; index < (cadeia.length() - (subLength - 1) )  ; index++){
               
                teste = cadeia.substring(index, index + subLength);
                System.out.println(teste);
                if(sub.compareTo(teste) == 0) rep++;
            }
            
            return rep;
        }
    }
    
    public void correrExercicio4(){
        Scanner is = new Scanner(System.in);
        
        System.out.print("Introduzir cadeia de carateres: ");
        obtida = is.nextLine();
        System.out.print("Introduzir sub-cadeia de caracteres: ");
        teste = is.nextLine();
        
        
        nrVezes = contaRep(obtida, teste);
        
        System.out.println("O número de vezes que a cadeia " + teste + " aparece na cadeia " + obtida + " é " +
                            nrVezes + ".");
    }
}
