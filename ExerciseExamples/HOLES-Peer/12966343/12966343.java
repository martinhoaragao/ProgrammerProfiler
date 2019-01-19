
import java.util.*;

/**
 *
 * @author Dell
 */
 class Nos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
     int testcase;
     testcase=sc.nextInt();
     for(int i=1;i<=testcase;i++){
         String ID;
         ID=sc.next();
         int count=0;
         for(int j=0;j<ID.length();j++){
             if(ID.charAt(j)=='A'|| ID.charAt(j)=='D'||ID.charAt(j)=='O'||ID.charAt(j)=='P'||ID.charAt(j)=='Q'||ID.charAt(j)=='R'){
                 count++;
             }
             else if(ID.charAt(j)=='B'){
                 count+=2;
             } 
     }
      System.out.println(count);
     }
    }
    
    }
    

//A=1B=2D=1O=1P=1Q=1R=1