import java.util.*;

public class LerVector
{
 
    public int ler(int n){
    
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> vals = new ArrayList<>();
        int v=0;
        int contador=0;
        
        System.out.println("Introduza um numero maior que 0!");
        if (n>0) {
            
        while(n>0){
        
        v=s.nextInt();
        vals.add(v);
        n--;
        }
        
        for(Integer i : vals){
        
        if(i % 2 ==0){contador++;}
        
        }
       }
       else{System.out.println("ERRO de Inteiro!");}
    
      return contador;
    }
}
