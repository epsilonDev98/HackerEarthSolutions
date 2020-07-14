/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/distribute-chocolates-70c2c2ab/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            long c=sc.nextLong();
            long n=sc.nextLong();
            long sum=(n)*(n+1)/2;
            if(sum<c){
                c-=sum;
                c%=n;
                System.out.println(c);
            }
            else{
                System.out.println(c);
            }

            
        }

    }
}
