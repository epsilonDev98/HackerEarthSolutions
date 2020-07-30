/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-the-earning-137963bc-323025a6/
*/



import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests=Integer.parseInt(br.readLine());
        for(int x=0;x<tests;x++){
            String str[]= br.readLine().trim().split(" ");
            int h=Integer.parseInt(str[0]);
            int cost=Integer.parseInt(str[1]);
            int arr[] = new int[h];
            String str2[]= br.readLine().trim().split(" ");
            int num=Integer.parseInt(str2[0]);
            int count=1;
            for(int i=1;i<arr.length;i++){
                arr[i]=Integer.parseInt(str2[i]);
                if(arr[i]>num){
                    count++;
                    num=arr[i];
                }
            }
            System.out.println(cost*count);

        }

    }
}
