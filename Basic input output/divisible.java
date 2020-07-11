/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisibe-or-2d8e196a/

*/


import java.io.*;
import java.util.*;
import java.lang.*;
public class TestClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int result=0;
        int num;
        for(int i=1;i<=n;i++){
            num=sc.nextInt();
            if(i<=n/2){
                while(num>9)
                    num/=10;
            }
            else{
                num%=10;
                }
            if(i%2==0)
                result+=num;
            else
                result-=num;
        }
        if(result%11==0)
            System.out.println("OUI");
        else
            System.out.println("NON");
    }
}
