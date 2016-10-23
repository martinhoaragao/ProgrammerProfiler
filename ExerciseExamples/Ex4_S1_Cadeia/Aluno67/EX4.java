import java.util.*;
import java.lang.String;
public class EX4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String cadeia;
        String sub;
        int conta = 0;
        int i=0;
        int tamc;
        int tams;
        
        System.out.println("Insira uma cadeia de carateres : ");
        cadeia = input.next();
        System.out.println("Insira uma outra cadeia : ");
        sub = input.next();
        
        if(sub.length() > cadeia.length() || cadeia.isEmpty() == true)
        {
            System.out.println("A segunda cadeia não aparece nenhuma vez na primeira cadeia.\n");
        }
        else
        { 
            if(sub.isEmpty() == true)
            {
                 System.out.println("A segunda cadeia  aparece uma vez na primeira cadeia.\n");
            }
            else
            {
               //Vamos a cada char da cadeia verificar se a substring começa nessa posição
                while((i = cadeia.indexOf(sub,i)) != -1) 
                { 
                    conta++; 
                    i ++; 
                }
              
            }
        }
        
        System.out.println("A segunda cadeia aparece "+conta+" vezes na primeira cadeia.\n");
    }
}
