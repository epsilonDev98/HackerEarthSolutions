/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/long-atm-queue-3/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
       for(int i=0;i<size-1;i++){
           if(arr[i]>arr[i+1]){
               count++;
           }
       }
        System.out.println(count);

    }
}
