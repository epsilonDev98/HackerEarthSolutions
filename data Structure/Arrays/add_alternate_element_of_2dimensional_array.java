/*
https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/add-alternate-elements-of-2-dimensional-array/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<arr.length;i=i+2){
            oddsum+=arr[i];
        }
        for(int i=1;i<arr.length;i=i+2){
            evensum+=arr[i];
        }
        System.out.println(oddsum);
        System.out.println(evensum);

    }
}
