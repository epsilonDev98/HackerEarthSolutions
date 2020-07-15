/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/psychic-powers/
*/


import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
      //  int count=0;
        String str=sc.next();
        StringBuilder sb= new StringBuilder();
        if(str.contains("111111") || str.contains("000000")){
        System.out.println("Sorry, sorry!");
    }
    else{
        System.out.println("Good luck!");
    }
    }
}
