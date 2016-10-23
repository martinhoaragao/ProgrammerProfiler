
import java.util.*;

public class Exercicios
{
    public static void exercico_2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas idades quer ler?");
        int numero = s.nextInt();
        List<Integer> superiores = new ArrayList<Integer>();

        System.out.println("Qual a idade de comparação?");
        int idade = s.nextInt();
        int idade_aux = 43,i = 1;
        
        while(numero!=0){
            
            System.out.println("Qual a "+ i +"º idade?");
            idade_aux = s.nextInt();
            
                while(idade_aux < 0){
                    System.out.println("Idade Invalida");
                    System.out.println("Qual a "+ i +"º idade?");
                    idade_aux = s.nextInt();
                        
    }
            if(idade_aux > idade ) {superiores.add(idade_aux);
                        }
            i++;
            numero--;
    }
      System.out.println("Idades superiores a " + idade + ":");
      
      
      for(Integer x : superiores){
                System.out.println(x);
        }
    
}

}