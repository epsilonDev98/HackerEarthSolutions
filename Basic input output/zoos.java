/*

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/

*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String str=name.toLowerCase(); 
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='z'){
                x++;
            }
            if(str.charAt(i)=='o'){
                y++;
            }
        }
        if((2*x)==y){
            System.out.println("Yes");
 
        }
        else{
            System.out.println("No");
        }
 
    }
}