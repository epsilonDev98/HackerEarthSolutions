
/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/shreya-and-non-palindrome/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        boolean status=true;
        int len=str.length()-1;
        while(status){
            if(str.charAt(0)==str.charAt(len)){
                if((len-1)>0){
                    len--;
                }

                else{
                    System.out.println("0");
                    status=false;
                }
            }
            else{
                status=false;
                System.out.println(len+1);
            }
        }
    }
}
