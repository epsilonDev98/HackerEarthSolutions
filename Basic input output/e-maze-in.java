/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        int h=0,v=0;
       
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='L')
            {
                h--;
            }
            else if(str.charAt(i)=='R')
            {
                h++;
            }
            else if(str.charAt(i)=='D')
            {
                v--;
            }
            else
            {
                v++;
            }
        }
            
         System.out.print(h+" "+v);
    }
}
