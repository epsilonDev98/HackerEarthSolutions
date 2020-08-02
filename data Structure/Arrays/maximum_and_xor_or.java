/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/minimum-and-xor-or-6a05bbd4/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
        int size=sc.nextInt();
        long arr[]=new long[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLong();
        }
       // int min= new int[]
       long min=10000000;
       Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            long val=(arr[i]&arr[i+1])^(arr[i]|arr[i+1]);
            
            if(min>val){
                min=val;
            }
        }
        System.out.println(min);
        }
        

    }
}
