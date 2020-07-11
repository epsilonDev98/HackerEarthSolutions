/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/i-am-easy/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int result=0;
        for(int i=1;i<=10;i++){
            result =number*i;
            System.out.println(result);
        }

    }
}
