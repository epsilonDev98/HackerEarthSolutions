/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/case-conversion-d19fbcfe/
*/

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();

            String out_ = caseConversion(s);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static String caseConversion(String s){
        // Write your code here that converts the given camel case string s  and
        // returns a snake case version of that string
        
       //conversion logic
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase((s.charAt(i))) && i!=0){
                res+="_"+Character.toLowerCase((s.charAt(i)));
            }
            else if(Character.isUpperCase((s.charAt(i)))){
                res+=Character.toLowerCase((s.charAt(i)));
            }
            else{
                res+=s.charAt(i);
            }
        }
        return res;
    
    }
}
