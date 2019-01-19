
import java.util.*;
class InputOutput {
  public static void main(String[] args) {
    
    List<Integer> inputs= new ArrayList<Integer>();
    Scanner scan= new Scanner (System.in);
    int in= scan.nextInt();
    while (in!=42){
      inputs.add(in);
      in= scan.nextInt();
    }
    
    for (int i=0;i<inputs.size();i++){
      System.out.println(inputs.get(i));
    }
    
  }
}
