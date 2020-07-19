
/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/diwali-celebration/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int a=sc.nextInt();
            int n=sc.nextInt();
            int k=sc.nextInt();
            int total=0;
            if(n==0){
                System.out.println(a);
            }
            else{
                total=a+n*(k-1);
                System.out.println(total);
            }
        }

    }
}
