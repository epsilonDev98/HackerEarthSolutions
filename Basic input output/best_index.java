/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long arr[] = new long[n];
        String str[] = br.readLine().split("\\s+");
        arr[0] = Long.parseLong(str[0]);
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + Long.parseLong(str[i]);
        }
        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            int lastIndex = i;
            int counter = 2;
            while(lastIndex+counter<n){
                lastIndex += counter;
                counter++;
            }
            long sum = 0;
            if(i==0){
                sum = arr[lastIndex];
            }else{
                sum = arr[lastIndex] - arr[i-1];
            }
            if(sum>maxSum){
                maxSum = sum;
              
            }
        }
        System.out.println(maxSum);
    }
}


