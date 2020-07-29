/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/bracket-sequence-1-40eab940/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int cOpen=0;
        int cClose=0;
        int res=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                cOpen++;
            }
            else{
                cClose++;
            }
        }
        if(cOpen==cClose){
            cOpen=0;
            cClose=0;
            for(int i=0;i<str.length();i++){
            if(cOpen>0 && cOpen==cClose && str.charAt(i)=='('){
                res++;
            }
            if(str.charAt(i)=='('){
                cOpen++;
            }
            else{
                cClose++;
            }
            if(cOpen<cClose){
                cOpen=0;
                cClose=0;
                res=0;
            }
        }
        if(cOpen>cClose){
            res++;
        }
        else if(cOpen==cClose && str.charAt(str.length()-1)==')'){
            res++;
        }
        }
        System.out.println(res);

    }
}
