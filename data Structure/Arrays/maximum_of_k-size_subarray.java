/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximum-of-k-size-subarrays-deque/
*/


import java.util.*;
class TestClass {

    static void subArray(int arr[], int n, int k) 
    { 
        int j, max; 
        for (int i = 0; i <= n - k; i++) {   
            max = arr[i]; 
            for (j = 1; j < k; j++) { 
                if (arr[i + j] > max) 
                    max = arr[i + j]; 
            } 
            System.out.print(max + " "); 
        } 
    } 
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sizeSub=sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        subArray(arr,N,sizeSub);
    }
}
