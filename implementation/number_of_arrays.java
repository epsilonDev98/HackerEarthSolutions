/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/invert-it-b06fd53a/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q =sc.nextInt();
           // int arr[]=new int[n];
            int max=-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(temp<min)
                    min=temp;
                if(temp>max)
                    max=temp;
            }
            int seg=0;
            if(k==1)
                seg=max;
            else
                seg=min;
            if(seg<q)
                System.out.println(seg);
            else  
                System.out.println("NO");
           
        }


    }
}
