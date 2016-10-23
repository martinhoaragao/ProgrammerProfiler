
import java.util.Scanner;
public class Ex1
{
    
    static int nPares = 0;
    static int nImpares = 0;
    static int totalPares = 0;
    
    public static float mediaPares(){
        return totalPares/nPares;
    }
    
    
    
    public static void adicionaNumero(int x)
    {
        if((x % 2) == 0){
            nPares++;
            totalPares += x;
        }
        else nImpares++;
    }
}
