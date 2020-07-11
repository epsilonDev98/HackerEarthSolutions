/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/ladderophilia/

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
   
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("*   *");
        System.out.println("*   *");
        for(int i=0;i<num;i++){
            for(int j=0;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        System.out.println("*   *");
        System.out.println("*   *");
        }

    }
}
