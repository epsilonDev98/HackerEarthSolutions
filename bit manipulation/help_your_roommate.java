/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/a-new-experiment/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests =sc.nextInt();
        for(int j=0;j<tests;j++){
            int num=sc.nextInt();
            int count=0;
            while(num>0){
                num=num&(num-1);
                count++;
            }
            System.out.println(count);
        }

    }
}
