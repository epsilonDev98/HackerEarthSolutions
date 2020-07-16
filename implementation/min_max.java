/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int start=arr[0];
        for(int i=1;i<arr.length;i++){
            if((start+1)==arr[i]){
                 start++;
                continue;
            }
           else if(start==arr[i]){
               continue;
           }
           else{
               System.out.println("NO");
               System.exit(0);
           }
        }
        System.out.println("YES");

    }
}
