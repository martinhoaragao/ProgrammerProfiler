
import java.util.Arrays;
import java.util.Scanner;

 class JavaApplication53 {

   
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int i;
      while(t!=0){
          int n=sc.nextInt();
          int arr[]=new int[n];         
          
          for(i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
          }
          int pos=sc.nextInt();
          int pointer= arr[pos-1];
          Arrays.sort(arr);
          
           for(i=0;i<arr.length;i++){
              if(arr[i]==pointer)
              {
                  System.out.println(i+1);
                  break;
              }
          }
          t--;
      }
        
    }
    
}