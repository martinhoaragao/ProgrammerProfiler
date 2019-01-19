import java.util.*;
class treeroot{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while(t > 0){
     int n = scan.nextInt();
     int root = 0;
     for(int i=0;i<n;i++){
       int a = scan.nextInt();
       int b = scan.nextInt();
       root += (a - b);
     }
     System.out.println(root);
     t--;
    }
  }
}