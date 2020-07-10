/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/duration/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests =sc.nextInt();
        for(int i=0;i<tests;i++){
            int sh=sc.nextInt();
            int sm=sc.nextInt();
            int eh=sc.nextInt();
            int em=sc.nextInt();
            int res =(60*eh)-(60*sh)+em-sm;
            System.out.println((res/60)+" "+(res%60));
            
        }

    }
}
