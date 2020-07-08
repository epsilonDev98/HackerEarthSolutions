/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests= sc.nextInt();
        for(int x=0;x<tests;x++){
            int row = sc.nextInt();
            int temp=row-1;
            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=1;k<=2*temp;k++){
                    System.out.print("#");
                }
                temp=temp-1;
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }

    }
}
