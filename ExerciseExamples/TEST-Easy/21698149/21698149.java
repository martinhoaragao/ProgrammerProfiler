import java.util.*;
public class Main{

     public static void main(String []args){
    
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<Integer>();
    for(int i=0;i<=arr.size();i++)
    {
        arr.add(sc.nextInt());
        if(arr.get(i)==42)
            break;
        else
            System.out.println(arr.get(i));
    }
    
     }
}