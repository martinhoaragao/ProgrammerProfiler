import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.StringTokenizer;

 

/**

*

 */

 

/**

* @author Ankit Kanth

*

*/

class DOUBLE {

 

                /**

                * @param args

                */

                static class reader

                {

                                InputStreamReader isr=new InputStreamReader(System.in);

                                BufferedReader br;

                                StringTokenizer st;

                                public reader()

                                {

                                                br=new BufferedReader(isr);

                                               

                                }

                                String next()

                                {

                                                while(st==null||!st.hasMoreElements())

                                                {

                                                                try {

                                                                                st=new StringTokenizer(br.readLine());

                                                                }

                                                                catch(IOException e)

                                                                {

                                                                                e.printStackTrace();

                                                                }

                                                }

                                                return st.nextToken();

                                }

                                String nextLine()

                                {

                                                String str="";

                                                try {

                                                                str=br.readLine();

                                                }

                                                catch(IOException e)

                                                {

                                                                e.printStackTrace();

                                                }

                                                return str;

                                }

                                int nextInt()

                                {

                                                return Integer.parseInt(next());

                                }

                                Double nextDouble()

                                {

                                                return Double.parseDouble(next());

                                               

                                }

                                long nextLong()

                                {

                                                return Long.parseLong(next());

                                }

                }

                public static void main(String[] args) {

                               

 

                                reader sc=new reader();
                                int t = sc.nextInt();
                                while(t-->0)
                                {
                                	int inp = sc.nextInt();
                                	if(inp%2==0)
                                		System.out.println(inp);
                                	else
                                		System.out.println(inp-1);
                            		}
                            		
                                }

                              

                               

                }

 

