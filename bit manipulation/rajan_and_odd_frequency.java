/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/danny-and-his-loneliness/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[2*n+1];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int temp=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
           temp=temp^arr[i];
        }
        System.out.println(temp);


    }
}
