
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class E01
{
    public static void main(String args[])
    {
        int num = 0;
        int sum_par = 0;
        int num_par = 0;
        int num_impar = 0;
        List<Integer> lst = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert number: ");
        num = sc.nextInt();
        
        while(num != 0)
        {
            lst.add(num);
            
            System.out.print("Insert number: ");
            num = sc.nextInt();
        }
        
        sc.close();
        
        for(Integer i : lst)
        {
            if(i%2 == 0)
            {
                num_par++;
                sum_par += num;
            }
            else
            {
                num_impar++;
            }
        }   
        
        StringBuffer sb = new StringBuffer();
        double med_par = sum_par/num_par;
        
        sb.append("Números pares: ").append(num_par).append("\n");
        sb.append("Média pares: ").append(med_par).append("\n");
        sb.append("Números ímpares: ").append(num_impar).append("\n");
        
        System.out.println(sb.toString());
        
    }
}
