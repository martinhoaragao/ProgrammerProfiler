//coderadi
import java.io.*;
import java.util.*;

class Codechef{
    public static void main(String[] args)throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sumId = 0, sum = 0;
            for(int i=0; i<n; i++){
                sumId += sc.nextInt();
                sum += sc.nextInt();
            }
            System.out.println(sumId - sum);
        }
        
    }
}