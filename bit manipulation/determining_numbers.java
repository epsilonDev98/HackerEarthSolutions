/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/find-the-numbers-75f24949/
*/



import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();

        }
        int[] temp=new int[1000000];
       // int count=0;
        for(int i=0;i<arr.length;i++){
           temp[arr[i]]++;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]==1){
             System.out.print(i+" ");
        }
        }
    }
}
