import java.util.Scanner;
 
public class Main{
 
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t  = in.nextInt();
            while(t-->0){
                int n = in.nextInt();
                int x,y,res=0;
                for(int i=0; i<n; i++){
                    x = in.nextInt();
                    y = in.nextInt();
                    res+=x-y;
                }
                System.out.println(res);
                
            }
            in.close();
        }
} 