/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/akash-and-diagnol-moves-dfc4f00f/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if(x<0||y<0){
                System.out.println("-1");
            }
            else if(x<y){
                System.out.println("-1");
            }
            else{
                System.out.println(x);
            }
        }

    }
}
