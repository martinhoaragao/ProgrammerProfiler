

import java.util.Arrays;
import java.util.Scanner;

 class johny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int temp=arr[k-1];
        Arrays.sort(arr);
        int i;
        for( i=0;i<n;i++)
        {
            if(arr[i]==temp)
                break;
        }
            System.out.println(i+1);
    }
    
}
}
