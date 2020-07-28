/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/monk-and-his-friend/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            long m=sc.nextLong();
            long n=sc.nextLong();
            long temp=m^n;
            //String bin = Integer.toBinaryString(temp);
            int count;
            for (count = 0; temp > 0; ++count) {
                temp &= temp - 1;
            }
            System.out.println(count);
        }
    }
}
