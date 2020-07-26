/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/sorting-1-581e9aa0/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
          Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int size=sc.nextInt();
            List<Long>[] arr=new List[32];
            for(int j=0;j<32;j++){
                arr[j] =new ArrayList<>();
            }
            for(int j=0;j<size;j++){
                long val=sc.nextLong();
                long n=val;
                int count=0;
                while(n!=0){
                    n=n&(n-1);
                    count++;
                }
                arr[count].add(val);
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<32;j++){
                for(int k=0;k<arr[j].size();k++)
                    sb.append(' ').append(arr[j].get(k));
            }
            System.out.println(sb.substring(1));
        }


    }
}
