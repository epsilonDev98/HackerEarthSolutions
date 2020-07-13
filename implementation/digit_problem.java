/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        int k =sc.nextInt();
        char ch[] =str.toCharArray();
        for(int i=0;i<k;i++){
            for(int j=0;j<str.length();j++){
            if((ch[j]-'0')!=9){
                ch[j]='9';
               break;
            }
            }
        }
        System.out.println(String.valueOf(ch));

    }
}
