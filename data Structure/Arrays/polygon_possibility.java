/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/polygon-possible/
*/



import java.util.*;
class TestClass {
    static boolean CheckPoly(int a[], int n) 
    { 
        int sum = 0, maxS = 0; 
        for (int i = 0; i < n; i++) { 
            sum += a[i]; 
            maxS = Math.max(a[i], maxS); 
        } 
        if ((sum - maxS) > maxS) 
            return true; 
  
        return false; 
    } 
    public static void main(String args[] ) throws Exception {
      
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int len=sc.nextInt();
            int arr[] = new int[len];
            for(int i=0;i<arr.length;i++){
                arr[i] =sc.nextInt();
            }
            if(CheckPoly(arr,len)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
