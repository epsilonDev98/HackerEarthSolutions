/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/no-sharing-capillary-82ed3fe2/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();
            int takeoff1=0;
            int takeoff2=0;
            int takeoff3=0;
            int res=0;
            for(int i=2;i<=n;i++){
                if(i%p==0 && i%q!=0 && i%r!=0){
                    takeoff1++;
                } 
                else if(i%p!=0 && i%q==0 && i%r!=0){
                    takeoff2++;
                }
                else if(i%p!=0 && i%q!=0 && i%r==0){
                    takeoff3++;
                }
            }
            res=takeoff1+takeoff2+takeoff3;
            System.out.println(res);
            
        }

    }
}
