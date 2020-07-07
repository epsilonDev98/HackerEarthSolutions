/*

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(Character.isLowerCase(c)){
                ch[i]=Character.toUpperCase(c);
            }
            else{
                ch[i]=Character.toLowerCase(c);
            }
        }
        String result= new String(ch);
        System.out.println(result);
        
 
    }
}
