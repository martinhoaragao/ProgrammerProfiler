import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int cases = sc.nextInt();
      
      for(int i = 0; i < cases; i++){
        int songs = sc.nextInt();
        int[] lengths = new int[songs];
        
        for(int j = 0; j < songs; j++){
          lengths[j] = sc.nextInt();
        }
        
        int jbindex = sc.nextInt();
        int johnny = lengths[jbindex-1];
        
        Arrays.sort(lengths);
        int lindex = 0;
        
        for(int j = 0; j < songs; j++){
          if(lengths[j] == johnny){
            lindex = j + 1;
          }
        }
        System.out.println(lindex);
      }
      sc.close();
    }
}
