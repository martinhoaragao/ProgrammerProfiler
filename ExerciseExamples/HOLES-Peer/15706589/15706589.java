import java.util.*;

class Answer{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while(t-- > 0)
        {
            int count = 0;
            String str = sc.next();

            char [] arr = str.toCharArray();

            for(int i=0;i<str.length();i++)
            {
                if(arr[i]=='A'||arr[i]=='D'||arr[i]=='O'||arr[i]=='P'||arr[i]=='Q'||arr[i]=='R')
                    count++;
                else if(arr[i]=='B')
                    count += 2;
                else
                    continue;
            }

             System.out.println(count);

        }
    }
}