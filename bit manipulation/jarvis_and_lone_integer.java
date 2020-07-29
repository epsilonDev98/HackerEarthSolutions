/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/unit-existence/
*/


import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests=Integer.parseInt(br.readLine().trim());
        for(int x=0;x<tests;x++){
            int size=Integer.parseInt(br.readLine().trim());
            long arr[] = new long[size];
            long a=0;
            String str[]=br.readLine().trim().split(" ");
            for(int i=0;i<size;i++){
                arr[i]=Long.parseLong(str[i]);
                a=a^arr[i];
            }
           if(a>0){
               System.out.println(a);
           }
           else{
               System.out.println("-1");
           }
        }

    }
}
