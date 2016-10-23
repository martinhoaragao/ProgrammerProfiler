import java.util.*;

public class Exercício2
{
    public static void main(int M, int N) {
        List<Integer> idades = new ArrayList<Integer>();
        int a;
        int media = 0;
        while(N>0) {
            Scanner ler = new Scanner (System.in);
            System.out.println("Introduza a idade: ");
            a = ler.nextInt();
            if(a>M) {
                idades.add(a);
            }
            media=media+a;
            idades++;
            N--;
        }
        for (Integer i : idades) {System.out.println(i);}
        System.out.println("Numero de idades: " + idades.size() + "\n Media: " + (media/idades.size()) + "\n");
    }
}
            
   