/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/mystery-30/
*/



import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;
        PrintWriter p = new PrintWriter(System.out);
        // int n = sc.nextInt();
        while((n=br.readLine())!=null){
            long count=0;
            long a=Long.parseLong(n);
            count=Long.bitCount(a);
           p.println(count);
        }
        p.close();
     }
   }
