import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        List list1 = new ArrayList();
        list1.add('A');
        list1.add('D');
        list1.add('O');
        list1.add('P');
        list1.add('Q');
        list1.add('R');
        String string=scanner.nextLine();
        int count;
        while(test-->0){
            string=scanner.nextLine().toString();
            count=0;
            for(int i=0;i<string.length();i++){
                if(string.charAt(i)=='B'){
                    count+=2;
                }
                else if(list1.contains(string.charAt(i))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
