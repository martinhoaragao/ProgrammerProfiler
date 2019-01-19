import java.util.*;
class NumberMirror{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         do{
             System.out.println(t);
             t=sc.nextInt();
         }while(t!=42);
     }
}