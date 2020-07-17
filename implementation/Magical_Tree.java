/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/magical-tree/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        
        int res=Integer.MIN_VALUE;
        for(int i=0;i<tests;i++){
            
            String str=sc.next();
            //char ch[] =str.toCharArray();
            int sum=Integer.parseInt(String.valueOf(str.charAt(0)));

            //sum=ch[0]-48;
            for(int j=2;j<str.length();j=j+2){
                char ch=str.charAt(j);
                int b=Integer.parseInt(String.valueOf(ch));
                if(str.charAt(j-1)=='+'){
                    sum+=b;
                
                }
                else{
                    sum=sum-b;
                }
                //j++;
            }
            if(res<sum)
                res=sum;
        }
        System.out.println(res);
    }
}
