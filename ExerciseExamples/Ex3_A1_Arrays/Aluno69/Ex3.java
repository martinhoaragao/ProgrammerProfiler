
import java.util.*;
public class Ex3
{
    public static void main(int N, ArrayList<Integer> lista){
        int i = 0, par = 0;
        
		while (N>i && i< lista.size()) {
		    if(lista.get(i)%2==0) par++;
		    i++;
		}
        System.out.println("N pares: "+par+"\n");
   }
}
