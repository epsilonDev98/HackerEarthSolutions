/* 
https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/birthday-party-12/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
    Scanner sc = new Scanner(System.in);
    int tests=sc.nextInt();
    for(int i=0;i<tests;i++){
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m%n==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    }
}
