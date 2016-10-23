
import java.util.*;
public class Ex4
{
    public static void main(ArrayList<String> sub, ArrayList<String> lista){
        int i,j,k,num=0;
        
        for(i=0;i<lista.size();i++){
            if(lista.get(i) == sub.get(0)){
             for(j=i,k=0;j<lista.size() && k<sub.size() && lista.get(j)==lista.get(k);j++,k++){    
                 if(k==(sub.size()+1)) num++;
                }   
            }
        }

        System.out.println("N sub: "+num+"\n");
   }
}
