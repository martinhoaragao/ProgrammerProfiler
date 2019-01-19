import java.util.Scanner;
class Unclejohny {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int t=sc.nextInt();
            int []array=new int[t];
            int pos;
            for(int j=0;j<t;j++){
                array[j]=sc.nextInt();
            }
            pos=sc.nextInt();
            int copy=array[pos-1];
            for(int k=0;k<t;k++){
                for(int l=1;l<t-k;l++){
                    if(array[l-1]>array[l]){
                        int temp=array[l];
                        array[l]=array[l-1];
                        array[l-1]=temp;
                    }
                }
            }
            for(int j=0;j<t;j++){
                if(array[j]==copy){
                    System.out.println(j+1);
                }
            }
        }
    }
}
