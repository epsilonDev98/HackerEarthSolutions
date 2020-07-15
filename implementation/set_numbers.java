/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/set-numbers-bea74f5a/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int n=sc.nextInt();
            for(int j=0;j<=n;j++){
                if(Math.pow(2,j)-1==n){
                    System.out.println(n);
                    break;
                }
                if(Math.pow(2,j)>n){
                    n=(int)Math.pow(2,j-1)-1;
                    System.out.println(n);
                    break;
                }
            }
        }

    }
}
