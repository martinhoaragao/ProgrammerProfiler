
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

class UncleJun
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  =  new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        while(testCases-- > 0)
        {
            int len = Integer.parseInt(reader.readLine());
            StringTokenizer st = new StringTokenizer(reader.readLine());
            TreeSet<Integer> elements = new TreeSet<>();
            int position = Integer.parseInt(reader.readLine());
            int obj = 0 ;
            for(int i = 0 ; i < len ; i++) {
                int j = Integer.parseInt(st.nextToken());
                if(i == position-1)
                    obj = j;
                elements.add(j);
            }
            List<Integer> second = new ArrayList<>(elements);
            System.out.println(second.indexOf(obj)+1);
        }
    }
}