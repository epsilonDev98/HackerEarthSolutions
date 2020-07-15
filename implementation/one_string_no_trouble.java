/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/one-string-no-trouble-37037871/
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
  
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char[] ch =str.toCharArray();
        int count=0;
        int res=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                count++;
            }
            else{
                count=0;
            }
            if(res<count){
                res=count;
            }
        }
    System.out.println(res+1);
    }
}
