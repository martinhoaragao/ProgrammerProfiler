import java.util.Scanner;
import java.lang.String;


    public class exercicio4
    {
       
        public static void ex4 (String[] args){
               
            Scanner tmp = new Scanner (System.in);
            String x = tmp.next();
            String y = tmp.next();
            int i, cont = 0;
            for(i=0;i<=x.length();i++){
            if((i + y.length())<=x.length()){
                if(x.substring(i,i+y.length()).equals(y)){
                    cont++;
                }
            }
        }
        
    } 
        
    }
    
                       
                 
              



