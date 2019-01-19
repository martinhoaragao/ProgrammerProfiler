import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int cases = Integer.valueOf(t.next());
        for(int i = 0;i<cases;i++) {
            int num = Integer.valueOf(t.next());
            int [] arr = new int[num];
            for(int j = 0;j<num;j++){
                arr[j] = Integer.valueOf(t.next());
            }
            int position = Integer.valueOf(t.next());
            int lengthOfSong = arr[position - 1];

            Arrays.sort(arr);
            for(int x = 0;x<num;x++){
                if(arr[x] == lengthOfSong){
                    System.out.println(x+1);
                    break;
                }
            }
        }
    }
}
