/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int size=sc.nextInt();
            int peak=sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int res=0;
            res=peak-arr[0];
            if(res>0){
                System.out.println(res);
            }
            else{
                System.out.println("0");
            }
        }

    }
}
