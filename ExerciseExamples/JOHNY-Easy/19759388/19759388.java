import java.util.Scanner;
  class HelloWorld
{
    static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        
        int i = 0, j = 0;
 
        
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
  
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    
   static  void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            
            int m = (l+r)/2;
 
            
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            
            merge(arr, l, m, r);
        }
    }
     public static void main(String args[]){
         int T;
         int N,k;
         Scanner in = new Scanner(System.in);
        int a[],temp[];
         T=in.nextInt();
         for(int j=0;j<T;j++){
            N=in.nextInt();
            temp= new int[N];
            a= new int[N];
    for(int i=0;i<N;i++)a[i]=in.nextInt();
     for(int i=0;i<N;i++)temp[i]=a[i];
    k=in.nextInt();
            sort(a,0,N-1);
           for(int i=0;i<N;i++) if(a[i]==temp[k-1])System.out.println(i+1);
           
        
         }
     }
}