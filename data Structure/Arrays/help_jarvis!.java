/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/help-jarvis-8a39566e/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            String str = sc.next();
            char[] arr = str.toCharArray();
            boolean status = true;
            Arrays.sort(arr);
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1]-arr[i]!=1)
                status = false;
            }
            if(status == true)
            System.out.println("YES");
            else
            System.out.println("NO");
        } 
    }
}
