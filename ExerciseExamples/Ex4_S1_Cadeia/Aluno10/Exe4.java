
public class Exe4
{
    public static void main (String a1 , String a2){
       
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = a1.indexOf(a2,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += a2.length()-1;
            }
        }
        System.out.println(count);
    }
}
