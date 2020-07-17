/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/very-easy-1/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            String str=sc.next();
            long len=str.length();
            long res=(len*(len+1))/2;
            System.out.println(res);
        }

    }
}
