
import java.util.Scanner;

class DoubleStrings {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int temp;
    for(int i=0; i<count; i++){
      temp = scanner.nextInt();
      if((temp%2)==0){
        System.out.println(temp);
      }else{
        System.out.println(temp-1);
      }
    }
  }

}
