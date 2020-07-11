/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/a-movement-1/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int temp;
        if(num%5==0)
            temp=0;
        else
            temp=1;
        num/=5;
        temp+=num;
        System.out.println(temp);

    }
}
