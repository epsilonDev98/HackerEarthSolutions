/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/sherlock-and-xor/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int size=sc.nextInt();
            int arr[] =new int[size];
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            long even=0;
            long odd=0;
            for(int j=0;j<size;j++){
                if(arr[j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
                
                
            }
            System.out.println(even*odd);
        }

    }
}
