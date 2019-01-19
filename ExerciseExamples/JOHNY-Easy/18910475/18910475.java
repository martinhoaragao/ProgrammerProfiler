import java.util.Scanner;



public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int[] arr = new int[a];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int song = arr[k-1];
            
            int temp =0;
            
            for(int i=0; i<arr.length-1; i++){
                for(int v=0; v<arr.length-i-1; v++){
                    if(arr[v]>arr[v+1]){
                        temp = arr[v];
                        arr[v] = arr[v+1];
                        arr[v+1] = temp;
                    }
                }
            }
            for(int i=0; i<arr.length; i++){
                if(song==arr[i]){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}