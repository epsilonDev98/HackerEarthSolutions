/*

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/submissions/

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {

 
        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
       // String temp=str.toLowerCase();
        boolean status=true;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            {
                status=false;
               break;
            }
            i++;
            j--;
        }
        if(status==false){
            System.out.println("NO");
 
        }
        else{
        System.out.println("YES");
        }
 
    }
}