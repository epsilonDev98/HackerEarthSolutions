/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/subham-and-binary-strings/
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {

    public static void main(String args[] ) throws Exception {

        // Write your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests=Integer.parseInt(br.readLine());
        for(int i=0;i<tests;i++){
            int d=Integer.parseInt(br.readLine());
            int count=0;
            String str=br.readLine();
            for(int j=0;j<d;j++){
                if(str.charAt(j)=='0')
                    count++;
            }
            System.out.println(count);
        }

    }
}
