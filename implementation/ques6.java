/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/ques-6/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int row =sc.nextInt();
            for(int j=1;j<=row;j++){
                int k=0;
                for(int s=1;s<=row-j;s++){
                    System.out.print(" ");
                }
                while(k!=2*j-1){
                    System.out.print("*");
                    k++;
                }
                System.out.println();
            }
        }

    }
}
