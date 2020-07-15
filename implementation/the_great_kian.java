/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-great-kian/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        long arr[] = new long[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLong();
        }
        long sum1=0;
        long sum2=0;
        long sum3=0;
        for(int i=0;i<arr.length;i+=3)
        sum1+=arr[i];
        for(int i=1;i<arr.length;i+=3)
        sum2+=arr[i];
        for(int i=2;i<arr.length;i+=3)
        sum3+=arr[i];
        System.out.print(sum1+" "+sum2+" "+sum3);

    }
}
