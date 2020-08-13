/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/k-rotation-is-what-you-can-855157f8/
*/



import java.util.*;
class TestClass {
    static void leftRotate(int arr[], int len, int d){
        int mod=d%len;
        for(int i=0;i<len;i++){
             System.out.print(arr[(i+mod)%len]+ " ");  
        }
        System.out.println();
    }
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int d=sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        leftRotate(arr,len,d);

    }
}
