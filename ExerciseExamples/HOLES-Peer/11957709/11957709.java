import java.util.Scanner;
 class test2 {
    public static int raw(char c){
        if(c=='C'||c=='F'||c=='H'||c=='I'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='S'||c=='T'||c=='U'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'||c=='E'||c=='G')return 0;
        if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')return 1;
        if(c=='B')return 2;
        else return 0;
    }
     public static void main(String args[]){
          Scanner t = new Scanner(System.in);
 
        int s = t.nextInt();
        while(s-->0) {
 int sum=0;
            String a=t.next();
            for(int i=0;i<a.length();i++){
               sum=sum+raw(a.charAt(i)); 
            }
            System.out.println(sum);
            
        }
     }
}