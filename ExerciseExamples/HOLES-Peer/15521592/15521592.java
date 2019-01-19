//package demoapplication;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        ABCDEFGHIJKLMNOPQRSTUVWXYZ
        int[] holes={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
        for(int x=0;x<n;x++)
        {
            String str=s.next();
            char []str_arr=str.toCharArray();
            int countHoles=0;
            for(int i=0;i<str_arr.length;i++){
                countHoles+=holes[str_arr[i]-65];
            }
            System.out.println(countHoles);
        }
    }
}