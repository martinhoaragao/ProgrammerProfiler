
import java.util.*;
public class Ex2
{
    public static void main(int N, int M){
        int idades = 0, media = 0, a;
        List<Integer> idade = new ArrayList<>();
        while(N>0){
            Scanner ler= new Scanner (System.in);
            System.out.println("Introduza idade.");
            a= ler.nextInt();
            if(a>M){
                idade.add(a);
                
            }
            media=media+a;
            idades++;
            N--;
        }
        for (Integer i : idade) {System.out.println(i);}
        System.out.println("N idades: "+idades+"\n Media: "+(media/idades)+"\n");
   }
}
