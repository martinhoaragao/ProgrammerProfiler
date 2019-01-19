import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Solution{
    
    public static void main(String []args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int test_cases = Integer.parseInt(br.readLine());
        
        while(test_cases-- > 0){
            
            int size = Integer.parseInt(br.readLine());
            
            String []input = br.readLine().split(" ");
            int []arr = new int[size];
            for(int i=0; i<size; i++)
                arr[i] = Integer.parseInt(input[i]);
            
            int index = Integer.parseInt(br.readLine());
            
            int johnny = arr[index - 1];
            
            Arrays.sort(arr);
            
            for(int i=0; i< size ; i++){
                if(johnny == arr[i]){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}