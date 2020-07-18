/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/string-sum/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        // Write your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int res=0;
        for(int i=0;i<str.length();i++){
            int p=(int)str.charAt(i);
            p-=96;
            res+=p;
        }
        System.out.println(res);
    }
}
