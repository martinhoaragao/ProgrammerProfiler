import java.util.Scanner;

class Main{


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[2][n];
        long dArr[] = new long[n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        dArr[0]=Math.abs(arr[0][0]-arr[1][0]);
        int j=1;
        long x=0,y=0;
        while(j<n){
            x=0;
            y=0;
            if(j<2){
                x = Math.abs(arr[0][j]-arr[0][j-1])+Math.abs(arr[1][j]-arr[1][j-1]);
            }
            else
                x = Math.abs(arr[0][j]-arr[0][j-1])+Math.abs(arr[1][j]-arr[1][j-1])+dArr[j-2];
            y = Math.abs(arr[0][j]-arr[1][j])+dArr[j-1];
            dArr[j] = Math.max(x, y);
            j++;
        }
        System.out.println(dArr[n-1]);
    }
}