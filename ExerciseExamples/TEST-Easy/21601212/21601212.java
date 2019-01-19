import java.util.*;

public class Main{
   public static void main(String args[]) {
   Scanner scan = new Scanner(System.in);
      while (true){
         int i = scan.nextInt();
         if(i != 42){
             System.out.println(i);
         }else {
      //System.exit(0);
      break;
      }
   }
}

}