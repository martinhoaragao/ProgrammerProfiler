import java.util.*;

class ATM{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double w = sc.nextDouble();
double b = sc.nextDouble();
if (w % 5 != 0){
System.out.println(b);
}
else if ((w+0.50) > b){
System.out.println(b);
}
else {
System.out.println((b-0.50)-w);
}
}
}

