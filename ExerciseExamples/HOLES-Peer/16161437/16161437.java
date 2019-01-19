
import java.util.Scanner;

class NewClass1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        for(int i = 0; i<T; i++){
            String data = "";
            data = S.next();int count =0;
            char[] a = data.toCharArray();
            for(int j = 0; j<a.length; j++){
                if(a[j] == 'A' || a[j] == 'D' || a[j] == 'O' || a[j] == 'P' || a[j] == 'Q' || a[j] == 'R'){
                    count++;
                }
                if(a[j] == 'B')
                    count= count + 2;
            }
            System.out.println(count);
        }
    }
}
