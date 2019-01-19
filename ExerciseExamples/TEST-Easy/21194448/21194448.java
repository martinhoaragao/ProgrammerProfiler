import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        while(true){
        String name = s.nextLine();
        int num = Integer.parseInt(name);
        if(num==42)
        	break;
        System.out.println(num);
        }
        
    }
}
