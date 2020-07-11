/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        while(true){
            int num=sc.nextInt();
            if(num==42){
                break;
            }
            else{
                System.out.println(num);
            }
        }

    }
}
