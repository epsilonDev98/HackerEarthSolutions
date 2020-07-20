/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/final-destination-cakewalk/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int len=st.length();
        int a=0,b=0;
        for(int i=0;i<len;i++){
            if(st.charAt(i)=='L')
                a--;
            if(st.charAt(i)=='R')
                a++;
            if(st.charAt(i)=='U')
                b++;
            if(st.charAt(i)=='D')
                b--;
        }
        System.out.println(a +" "+b);
    }
}
