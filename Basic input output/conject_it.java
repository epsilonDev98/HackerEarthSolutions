/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/conject-it/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<tests;i++){
            String num=sc.nextLine();
            int j=num.length()-1;
            while((int)num.charAt(j)==0)
                j--;
            
            int temp=(int)num.charAt(j);
            while(temp!=1){
                if(temp%2==0)
                    temp/=2;
                else
                    temp=3*temp+1;
                
            }
            if(temp==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
