import java.util.Scanner;


class Codechef_2 {

    
    public static void main(String[] args) {
       
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        
        for(int i=1;i<=n;i++){
                int count=0;
                    String a=x.next();
            for(int d=0;d<a.length();d++){
                if(a.charAt(d)=='A'||a.charAt(d)=='D'||a.charAt(d)=='O'||a.charAt(d)=='P'||a.charAt(d)=='R'||a.charAt(d)=='Q'){
                    count++;
            }
                else if(a.charAt(d)=='B'){
                    count+=2;
                }
                
            }
                System.out.println(count);
        }
        
    }
    
}
