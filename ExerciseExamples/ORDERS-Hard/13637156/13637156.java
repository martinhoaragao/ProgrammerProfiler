import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int x=0;
        while(x<T){
            int n = in.nextInt();
            int arr[] = new int[n];
            int res[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
                res[i] = i+1;
            }
            for(int i=n-1;i>=0;i--){
                shift(res,arr[i],i-arr[i]);
            }
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println("");
            x++;
        }
    }
    static void shift(int arr[],int t,int pos){
        int temp = arr[pos];
        while(t!=0){
            arr[pos] = arr[pos+1];
            t--;
            pos++;
        }
        arr[pos] = temp;
    }
}
