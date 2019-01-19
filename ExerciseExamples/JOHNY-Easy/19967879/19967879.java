import java.util.Scanner;
// problem f
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int count=0;count<t;count++){
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }

            int k = sc.nextInt();
            int find = a[k-1];

            for(int i=0;i<a.length-1;i++){
                int min=a[i];
                int index = -1;
                for(int j=i+1;j<a.length;j++){
                    if(a[j]<min){
                        min=a[j];
                        index=j;
                    }
                    if(min!=a[i]){
                        int icu=a[i];
                        a[i]=a[index];
                        a[index]=icu;
                    }
                }
            }

            int output = -1;
            for(int i=0;i<a.length;i++){
                if(a[i]==find){
                    output=i+1;
                    break;
                }
            }
            System.out.println(output);
        }

    }
}
