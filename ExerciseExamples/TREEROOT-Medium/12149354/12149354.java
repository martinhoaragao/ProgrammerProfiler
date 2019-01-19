import java.util.Scanner;
 class RootOfTheProblem {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] array = new int[n];
         for(int i=0;i<n;i++)
         {
             int inputNumber = sc.nextInt();
             int sum=0;
             for(int j=1;j<=inputNumber*2;j++)
             {
                 if(j%2 != 0)
                     sum = sum+sc.nextInt();
                 else
                     sum = sum-sc.nextInt();
             }
             array[i] = sum;
             
         }
         for(int i=0;i<n;i++)
             System.out.println(array[i]);
     }
}
