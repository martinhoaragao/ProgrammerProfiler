import java.util.Scanner;

public class Main{

     public static void main(String []args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int n = 0;
        while(reader.hasNextInt())
        {
            n = reader.nextInt();
            if(n == 42)
                break;
            System.out.println(n);
        }
        //once finished
        reader.close();
        
     }
}