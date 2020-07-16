/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/array-sum-2-725368ac/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long arr[] = new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
