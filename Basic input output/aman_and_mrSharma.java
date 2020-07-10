/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/aman-mrsharma/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
        int t=0;
        for(int i=0;i<d;i++){
            long r =sc.nextLong();
            long h =sc.nextLong();
            long dis =44*r;
            long DisH=700*h;
            if(dis<=DisH){
                t++;
            }
        }
        System.out.println(t);

    }
}
