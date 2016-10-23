
import java.util.*;
public class Ex1
{
    private int pares=0,impares=0,ntotal=0,vtotal=0;
    private double media=0;
    
    public void main () {
        int v;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Numero:");
            ntotal++;
            v=scanner.nextInt();
            if (v!=0) {
                vtotal+=v;
                if (v%2==0) {
                    this.pares++;
                }else{
                    this.impares++;
                }
                media=vtotal/ntotal;
                System.out.println("Media: "+media+"\nPares: "+pares+"\nImpares: "+impares);
            }
        }while(v!=0);
    }
}
