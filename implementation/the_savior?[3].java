/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-savior-3/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int n=sc.nextInt();
            int arr[] =new int[n];
            int count=0;
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[j]+arr[k])%2==0 && arr[j]!=arr[k]){
                        count++;
                    }
                }
            }
            System.out.println(count);
            count=0;
        }

    }
}
