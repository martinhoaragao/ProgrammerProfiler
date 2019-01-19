import java.util.Scanner; 


public class Main {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        float Y =  in.nextFloat();
        
        if((X+0.50)<Y && X%5==0)
         Y=(float) (Y-( X+0.50));
           
        System.out.println(Y); 
  
        
        
     
        
    }
    
}
 