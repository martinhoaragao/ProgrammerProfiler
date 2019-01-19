import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class UncleJohny {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();


        while(t-->0){
            int a=sc.nextInt();
            int arr [] =new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            int pos=sc.nextInt();
            int num=arr[pos-1];
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    System.out.println(i+1);
                }
            }
        }
    }
}
