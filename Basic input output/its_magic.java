
/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/its-magic/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long arr[] = new long[size];
        long sum=0;
        int count=-1;
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextLong();
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            long temp=sum-arr[i];
            if(temp%7==0){
                if(count==-1||arr[i]<arr[count]){
                    count=i;
                }
            }
        }
        System.out.println(count);


    }
}
