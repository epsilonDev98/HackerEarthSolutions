/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/modify-sequence/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp=1;
        for(int i=1;i<N;i++){
            if(arr[i]<arr[i-1]){
                temp=2;
                break;

            } 
            arr[i]+=-arr[i-1];
        }
        if(temp==2){
            System.out.println("NO");
        }
        else{
            if(arr[N-1]==0){
            System.out.println("YES");
            }
            else{
            System.out.println("NO");
            }
        }
        

    }
}
