import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int A = 0, B = 0, C = 0, D=0, E=0, F=0, G=0, H=0, I=0, J=0, K=0, L=0, M=0, N=0, O=0, P=0, Q=0, R=0, S=0, T=0, U=0, V=0, W=0, X=0, Y=0, Z = 0;
        
        while (t > 0) {
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                char ss = s.charAt(i);
                if(ss == 'A'){
                    A +=1;
                }else if(ss == 'B'){
                    B +=2;
                }else if(ss == 'C'){
                    C +=0;
                }else if(ss == 'D'){
                    D +=1;
                }else if(ss == 'O'){
                    O +=1;
                }else if(ss == 'P'){
                    P +=1;
                }else if(ss == 'Q'){
                    Q +=1;
                }else if(ss == 'R'){
                    R +=1;
                }
            }
            int sum = A+B+C+D+O+P+Q+R;
            System.out.println(sum);
            sum=0;
            A =0;B=0;C=0;D=0;O=0;P=0;Q=0;R=0;

            t--;
        }
    }

}
