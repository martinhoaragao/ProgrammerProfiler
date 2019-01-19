import java.util.*;
class HelloWorld{

     public static void main(String []args){
        
        Scanner reader = new Scanner(System.in);
        
        int i,j,N,T,val,K,index;
        int arr[];
        
        T = reader.nextInt();
        
        for(i=1;i<=T;i++)
        {
            N = reader.nextInt();
            arr = new int[N];
            index = -1;
            
            for(j=0;j<N;j++)
            arr[j] = reader.nextInt();
            
            K = reader.nextInt();
            val = arr[K-1];
            
            Arrays.sort(arr);
            
            for(j=0;j<N;j++)
            {
                if(val==arr[j])
                {
                    index = j+1;
                    break;
                }
            }
            
            System.out.println(index);
        }
     }
         
}