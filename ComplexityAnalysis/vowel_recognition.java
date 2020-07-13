/*
https://www.hackerearth.com/practice/basic-programming/complexity-analysis/time-and-space-complexity/practice-problems/algorithm/vowel-game-f1a1047c/
*/



import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<tests;i++){
            String str=sc.nextLine();
            long count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'||str.charAt(j)=='A'||str.charAt(j)=='E'||str.charAt(j)=='I'||str.charAt(j)=='O'||str.charAt(j)=='U'){
                    count=count+(long)(str.length()-j)*(j+1);
                }
            }
            System.out.println(count);
        }


    }
}
