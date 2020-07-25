/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/the-rise-of-jabari/
*/



import java.util.*;

class TestClass {
        static long gcd(long a,long b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String args[] ) throws Exception {
       
        // Write your code here
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long lcm=0;
        for(long i=0;i<N;i++){
            long x=sc.nextLong();
            if(x!=0){
                if(i==0)
                    lcm=x;
                else   
                    lcm=(lcm*x)/gcd(lcm,x);

            }
        }
        System.out.println(lcm);
       
    }
}
