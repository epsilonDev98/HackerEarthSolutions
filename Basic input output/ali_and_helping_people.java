/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        //StringBuffer sb = new StringBuffer(str);
        boolean status =true;
        for(int i=0;i<str.length()-1;i++){
            if(Character.isDigit(str.charAt(i)) &&(Character.isDigit(str.charAt(i+1)))){
          char ch =str.charAt(i);
          char nch =str.charAt(i+1);
          int a=Integer.parseInt(String.valueOf(ch));
          int b=Integer.parseInt(String.valueOf(nch));
          if((a+b)%2!=0){
              status=false;
              break;
          }
                

            }
            if(Character.isAlphabetic(str.charAt(i))){
                if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='Y'){
                    status=false;
                    break;
                }
            }
        }
        if(status==false){
            System.out.println("invalid");
        }
        else{
            System.out.println("valid");
        }


    }
}
