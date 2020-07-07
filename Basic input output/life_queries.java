/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/lift-queries/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int l=0;
        int u=7;
        for(int i=0;i<tests;i++){
            int floor=sc.nextInt();
            if(Math.abs(u-floor)<Math.abs(floor-l)){
                u=floor;
                System.out.println("B");
               
            }
            else{
                l=floor;
                System.out.println("A");
               
            }
        }

    }
}
