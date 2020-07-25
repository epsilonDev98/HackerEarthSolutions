/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/mystery-31/
*/


import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num="";
        PrintWriter p = new PrintWriter(System.out);
        
        //long count=0;
        while((num=br.readLine())!=null){
            long res=0;
            long a=Long.parseLong(num);
            for(int i=0;i<=64;i++){
                if((a&(1<<i))!=0){
                    res=1<<i;
                    break;
                }
            }
            
           p.println(res);
            }
            p.close();
        
    }
}
