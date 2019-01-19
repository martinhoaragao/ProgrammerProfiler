import java.util.*;
class main{
      public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      float X=sc.nextFloat();
      float Y=sc.nextFloat();
      if(X<Y-0.5f){
            if(X%5==0){
            System.out.println(Y-X-0.5);}
            else
            {
                System.out.println(Y);         
            }
            
      
      }
      else{
      System.out.println(Y);}
     } 


}