import java.util.*;

 class NewClass5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-->0){
          int q = s.nextInt();  
             
             if(q%2==0){
                 System.out.println(q);
             }else{
                 System.out.println(q-1);
             }
         }
        }
    }
    

