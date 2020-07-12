/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int stk=0;
        int req[] ={6,2,5,5,4,5,6,3,7,6};
        for(int i=0;i<tests+1;i++){
            String str=sc.nextLine();
            for(int j=0;j<str.length();j++){
                stk+=req[Integer.parseInt(String.valueOf(str.charAt(j)))];
            }
            if(stk%2==0){
                for(int j=0;j<stk/2;j++){
                    System.out.print("1");
                }

            }
            else{
                System.out.print("7");
                for(int j=0;j<stk/2-1;j++)
                System.out.print("1");
                
            }
            System.out.println();
            stk=0;
        }                             

    }
}
