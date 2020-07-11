/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/char-sum-2d3a6ab5/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int res=0;
        for(int i=0;i<str.length();i++){
            res+=str.charAt(i)-'a'+1;
        }
        System.out.println(res);
    }
}
