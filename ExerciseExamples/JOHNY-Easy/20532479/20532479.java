import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int A[]= new int[n];
            for(int i=0; i<A.length; i++)
            {
                A[i]=sc.nextInt();
            }
            int k_prev=sc.nextInt();
            int k_ele = A[k_prev - 1];
            Arrays.sort(A);
           int res=Arrays.binarySearch(A, k_ele);
            System.out.println(res+1);      
        }
    }
}
