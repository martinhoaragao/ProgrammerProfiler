

import java.util.Scanner;

public class Main{

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        int bb[] = new int[t];
        for (int i = 0; i < t; i++) {
            long num = in.nextLong();
            
            if(num % 2 == 0)
                System.out.println(num);
            else
                System.out.println(num-1);
            
        }
  
    }
    
}
