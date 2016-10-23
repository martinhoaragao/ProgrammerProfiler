
//Exercicio 2

import java.util.*;

public class Exercicio2
{
    
    private static ArrayList<Integer> numeros ;
    
    public static float GeraList(ArrayList<Integer> nr, int n , int m){
        
        Integer num [] = {23,34,3,65,20,24,9,7,51,43,60,87,53,37};
        float resultado = 0;
        float media = 0;
        int i=0;
        
        numeros = new ArrayList<Integer>(Arrays.asList(num));
        
        Iterator it = numeros.iterator();
        nr = new ArrayList<Integer>();
        
        while (it.hasNext()){ 
            int p = (int) it.next();
            if(p > m ){
                nr.add(p);
            }
        }
        
        Iterator maior = nr.iterator();
        
            
        while (maior.hasNext()){
            if (i<n){
                int q = (int) maior.next();
                resultado = resultado + q;
                System.out.println("Numero ARRAY ->" + q);
                i++;
            }else break;
        }
             
        return media = (float)(resultado/n);
    }
}
