/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/print-hackerearth/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String str=sc.next();
        //char[] ch=str.toCharArray();
        String str2="hackerearth";
        int min=100000;
        for(int i=97;i<123;i++){
            int count=0;
            int temp=0;
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)==(char)i){
                    count++;
                }
            }
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==(char)i){
                    temp++;
                }
            }
            if(count!=0){
                int x=temp/count;
                min=min>x?x:min;
                    
            }
        }

        System.out.println(min);
        

    }
}
