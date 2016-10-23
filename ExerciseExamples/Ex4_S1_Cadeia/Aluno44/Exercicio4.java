import java.util.Scanner;

public class Exercicio4
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String text;
        String key;
        int count = 0;
        
        System.out.println("String onde vamos procurar: ");
        text = input.nextLine();
        System.out.println("SubString que vamos procurar: ");
        key = input.nextLine();
        
        for(int i = 0; i < text.length(); i++)
        {
            if(i + key.length() < text.length())
            {   
                String sub = text.substring(i, i+key.length());
                if(key.equals(sub)) count++;
            }
        }
        
        System.out.println("A cadeia '"+text+"' contem "+count+" subcadeias de '"+key+"'.");
    }
}
