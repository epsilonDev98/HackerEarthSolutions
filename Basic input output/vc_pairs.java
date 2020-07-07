/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/vc-pairs/
*/

import java.util.*;
class TestClass {

    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int j=0;j<tests;j++){
            int count=0;
            int size = sc.nextInt();
            String str= sc.next();
            char ch[]= str.toCharArray();
            for(int i=0;i<size-1;i++){
                if(!(ch[i]=='a'||ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')&&(ch[i+1]=='a'||ch[i+1]=='e'|| ch[i+1]=='i'|| ch[i+1]=='o'||ch[i+1]=='u')){
                    count++;
                }
            }
            System.out.println(count);
           
        }

    }
}
