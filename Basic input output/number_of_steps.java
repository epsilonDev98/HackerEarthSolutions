/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/make-all-equal-90a21ab2/
*/


import java.util.*;
import java.lang.Math;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        int arr1[] =new int[tests];
        int arr2[]=new int[tests];
        for(int i=0;i<tests;i++){
            arr1[i]=sc.nextInt();
            //arr2[i]=sc.nextInt();
            
        }
        for(int i=0;i<tests;i++){
           // arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            
        }
        int stp=0;
        boolean status=false;
        boolean diff=true;
        int min=Arrays.stream(arr1).min().getAsInt();
        while(diff){
            diff=false;
            for(int i=0;i<tests;i++){
                while(arr1[i]>min&&arr2[i]!=0){
                    arr1[i]=arr1[i]-arr2[i];
                    diff=true;
                    stp++;
                }
                if(min>arr1[i])
                min=arr1[i];
                if(min<0) break;
            }
        }
        if(min>=0)
        System.out.print(stp);
        else
        System.out.print(-1);
    }
}
