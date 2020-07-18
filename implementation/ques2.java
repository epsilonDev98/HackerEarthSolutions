/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/ques-2/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int status=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]>=x)&&(arr[i]<=y)){
                status=1;
            }
            else{
                status=0;
                break;
            }
        }
        if(status==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
