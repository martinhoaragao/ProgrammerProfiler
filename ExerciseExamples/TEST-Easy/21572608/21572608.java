import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    num = sc.nextInt();
    Vector<Integer> v = new Vector();
    while(num!=42){
      v.add(num);
      num = sc.nextInt();
    }
    for(int i= 0;i<v.size();i++)
      System.out.println(""+v.get(i));
  }
}