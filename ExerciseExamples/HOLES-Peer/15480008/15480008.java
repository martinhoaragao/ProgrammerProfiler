
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Smith Colaco
 */
class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       String s[]=new String[t];
       for(int i=0;i<t;i++){
           s[i]=sc.next().toUpperCase();
       }
       for(int i=0;i<t;i++){
           for(int j=0;j<s[i].length();j++){
               
               int a=(int)s[i].codePointAt(j)-65;
               
               if(a==0){
                   count++;
                   
               }
               else if(a==1){
                   count=count+2;
                  
               }
               else if(a==3){
                   count++;
                   
               }
               else if(a==14){
                   count++;
                 
               }
               else if(a==15){
                   count++;
                   
               }
               else if(a==16){
                   count++;
                  
               }
               else if(a==17){
                   count++;
                  
               }
             
           }
           System.out.println(count);
           count=0;
           
       }
    }
    
}
