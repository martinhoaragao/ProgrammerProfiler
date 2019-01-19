  



    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.stream.IntStream;
class HolesInText {
        private static BufferedReader BR;
        private static int NOTS=0;
        public static void setBRandNOTS() throws NumberFormatException, IOException {
            BR = new BufferedReader(new InputStreamReader(System.in));
            NOTS = Integer.parseInt(BR.readLine());
        }

        public static int[] stringArrayToIntArray(String[] arg){
            int stringArrayLength = arg.length;
            int[] intArray = new int[stringArrayLength];
            for(int i=0;i<stringArrayLength;i++){intArray[i]=Integer.parseInt(arg[i]);}
            return intArray;

        }
        public static int[] getintArrayFromInputLine() throws IOException{
            return stringArrayToIntArray(BR.readLine().split(" "));

        }

        public static void main(String[] args) {
            try {
                setBRandNOTS();
            } catch (IOException e) {
                e.printStackTrace();
            }
            IntStream.range(0,NOTS).forEach(i->{
                int count=0;
                try {
                    char[] charArray;
                    String s=BR.readLine();

                    for ( int j=0;j<s.length();j++)
                    {switch(s.charAt(j)){
                        case 'A' :
                        case 'D' :
                        case 'O' :
                        case 'P' :
                        case  'Q':
                        case 'R':count++;break;
                        case 'B' : count=count+2;break;
                        default:break;
                    }

                    }
                    System.out.println(count);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
