import java.util.*;
class TestClass
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            ArrayList<Integer> list2=new ArrayList<>();
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                int ch=sc.nextInt();
                list.add(ch);
                list2.add(ch);
            }
            int search=sc.nextInt();
            int search_object=list.get(search-1);
            Collections.sort(list2);
            System.out.println(list2.indexOf(search_object)+1);
        }
    }
}