/**
 *
 * @author SergioLuis
 */
import java.math.BigInteger;
import java.util.*;

public class Main
{
    
    Main(){
    }
    
    public void solve(){
        Scanner cin = new Scanner(System.in);
        int casos, k = 3, lim = 20;        
        long[] primos = new long[lim];
        BigInteger[] valores = new BigInteger[lim];
        primos[0] = 2;
        primos[1] = 3;
        primos[2] = 5;        
        for(int i = 7; k < lim; i+=2){
            int j;
            for(j = 0; primos[j]*primos[j] <= i; j++){
                if(i%primos[j] == 0)
                    break;
            }
            if(primos[j]*primos[j] > i)
                primos[k++] = i;
        }
        for(int i = 0; i < k; i++)
            valores[i] = new BigInteger(String.valueOf(primos[i]));
//        System.out.println(k+" "+primos[k-1]);
        casos = cin.nextInt();
        for(int i = 0; i < casos; i++){
            BigInteger numero = cin.nextBigInteger();
            ArrayList<Long> lista = new ArrayList<Long>();
            for(int a = 0; a < k && numero.compareTo(BigInteger.ONE) > 0; a++){
                while(numero.mod(valores[a]).compareTo(BigInteger.ZERO) == 0){
                    numero = numero.divide(valores[a]);
                    lista.add(primos[a]);
                }
            }
            int cont = numero.compareTo(BigInteger.ONE) > 0 ? 1 : 0;
            System.out.println(lista.size()+cont);
            for(int j = 0; j < lista.size(); j++){
                System.out.println(lista.get(j));
            }
            if(cont > 0)
                System.out.println(numero);
        }
    }
    
    public static void main(String args[]){
        Main principal = new Main();
        principal.solve();
    }
}
