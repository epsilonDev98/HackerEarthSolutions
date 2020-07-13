/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/rain-41f57695/
*/


import java.util.*;
import java.lang.Math;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int s=sc.nextInt();
            int min=(int)Math.ceil((double)l/(double)s);
            int max=(int)Math.floor((double)r/(double)s);
            if(min>max){
                System.out.println("-1 -1");
            }
            else{
                System.out.println(min+" "+max);
            }
            
        }
        

    }
}
