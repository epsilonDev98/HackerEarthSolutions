/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/ankits-no-ed95054d/
*/



import java.util.*;
class TestClass {
     
     public static long firstBitPos(long n) 
    { 
       
        return (long)((Math.log10(n & -n)) / Math.log10(2)) + 1; 
    } 
  
    public static void main(String args[] ) throws Exception {
        

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int size=sc.nextInt();
            long sum=0;
                
            for(int i=0;i<size;i++){
                long num=sc.nextInt();
                long pos=firstBitPos(num);
                long k=pos-1;
                long val=(long)Math.pow(2,k);
                sum=sum+val;
            }
            System.out.println(sum);
        }

    }
}
