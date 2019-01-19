import java.util.Scanner;

class codechef{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int hole,i,len,t=s.nextInt();
        String str;
        int ch;
        while(t-->0){
            hole=0;
            str=s.next();
            len=str.length();
            for(i=0;i<len;i++){
                ch = (int)(str.charAt(i)) - 65;
                if(ch==0||ch==3||ch==14||ch==15||ch==16||ch==17) hole++;
                else if(ch==1) hole +=2;
            }
            System.out.println(hole);
        }
    }

}