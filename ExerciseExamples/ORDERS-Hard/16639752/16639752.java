     
    import java.io.IOException;
    import java.io.InputStream;
     
    class NewClass
    {
        static final int LEN=450,MAX=1000;
        static int n,start;
        static Node train[],end;
        static Record[] rec;
        static FastReader1 fr=new FastReader1(System.in);
        static StringBuilder sb=new StringBuilder();
        
        public static void main(String[] args)throws Exception
        {
            int i;
            for(int tc=fr.nextInt();tc>0;tc--)
            {
                rec=new Record[MAX];
                train=new Node[n=fr.nextInt()];
                for(i=0;i<n;i++)
                    add(i,fr.nextInt());
                for(i=n;i>0;i--)
                {
                    //System.out.print(end.data+", ");
                    end.data=i;
                    end=end.prev;
                }
                //System.out.println();
                for(Node jk:train)
                    sb.append(jk.data).append(" ");
                sb.append("\n");
            }
            System.out.print(sb);
        }
        static void add(int ind,int steps)
        {
            Node toAdd=train[ind]=new Node(ind);
            int pos=steps;
            if(steps==0)
            {
                toAdd.prev=end; end=toAdd;
                --pos;
            }
            else
            {
                Node copy=end;int i;
                
                for(i=MAX;rec[i-1].jumps < steps;--i);
                if(i<MAX)
                {
                    copy=rec[i].point;  steps-=rec[i].jumps -1;
                }
                //System.out.println("\n***** i="+i+" st="+steps+"*****");
                //System.out.println("temp="+copy.getString());            
                
                for(--steps;steps > 0;--steps)copy=copy.prev;
                toAdd.prev=copy.prev;   copy.prev=toAdd;
            }
            if(ind%LEN==0)updateRec();
            else updateRec(pos);
            //printRec();
            //printList();
        }
        static void updateRec()
        {
            int k=0;    start=MAX;
            for(Node cop=end;cop!=null;cop=cop.prev, ++k)
                if(k%LEN==0)
                    rec[--start]=new Record(k+1,cop);
            rec[--start]=new Record(Integer.MAX_VALUE,new Node(-1));
        }
        static void updateRec(int jump)
        {
            for(int i=start+1;i<MAX && rec[i].jumps > jump;i++)
                ++rec[i].jumps;
        }
        static void printRec()
        {
            for(Record r:rec)
                if(r==null)
                    System.out.print("N, ");
                else
                    System.out.print(r.getString()+", ");
            System.out.println();
        }
        static void printList()
        {
            Node copy=end;String ans="";
            while(copy!=null)
            {
                ans=copy.getString()+", "+ans;
                copy=copy.prev;
            }
            System.out.println(ans);
        }
    }
     
    class Node
    {
        Node prev=null;
        int data;
        Node(Node p){prev=p;}
        Node(int d){data=d;}
        String getString(){return "d="+data;}
    }
     
    class Record
    {
        int jumps;Node point;
        Record(int ind,Node p){jumps=ind;point=p;};
        String getString(){return "(i="+jumps+", "+point.getString()+")";}
    }
     
    class FastReader1
    {
        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;
     
        FastReader1(InputStream is)
        {
            in = is;
        }
     
        int scan() throws IOException
        {
            if(index>=total){
                index = 0;
                total = in.read(buf);
                if(total<=0)
                    return -1;
            }
            return buf[index++];
        }
     
        String next() throws IOException
        {
            int c;
            for(c=scan(); c<=32; c=scan());
            StringBuilder sb = new StringBuilder();
            for(; c>32; c=scan())
                sb.append((char)c);
            return sb.toString();
        }
     
        int nextInt() throws IOException
        {
            int c, val = 0;
            for(c=scan(); c<=32; c=scan());
            boolean neg = c=='-';
            if(c=='-' || c=='+')
                c = scan();
            for(; c>='0' && c<='9'; c=scan())
                val = (val<<3) + (val<<1) + (c&15);
            return neg?-val:val;
        }
        long nextLong() throws IOException
        {
            int c;long val = 0;
            for(c=scan(); c<=32; c=scan());
            boolean neg = c=='-';
            if(c=='-' || c=='+')
                c = scan();
            for(; c>='0' && c<='9'; c=scan())
                val = (val<<3) + (val<<1) + (c&15);
            return neg?-val:val;
        }
    } 