import java.util.*;
class Main
{	
    public static void main (String[] args) 
	{
        Scanner scan = new Scanner(System.in);
                int cases = scan.nextInt();
                while(cases>0){
                    int N = scan.nextInt();
                    int k,index=0;
                    int arr[] = new int[N];
                    for(int i=0;i<N;i++)
                        arr[i] = scan.nextInt();
                    int K = scan.nextInt();
                    k = arr[K-1];
                    Arrays.sort(arr);
                    for(int i=0;i<N;i++)
                          if(arr[i]==k)
                              index = i+1;
                    
                    System.out.println(index);
                        
                        
                    
            cases--;
                }	
    }
} 