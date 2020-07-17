/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jarvis-and-seven-segments-1/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();

        for(int i=0;i<tests;i++){
            int min=100;
            int res=0;
           
            int size=sc.nextInt();
            int a[]=new int[size];
            for(int j=0;j<a.length;j++){
                a[j]=sc.nextInt();
            }
            for(int x=0;x<size;x++){
                 int c=0;
                 String str=Integer.toString(a[x]);
            for(int j=0;j<str.length();j++){
                    if(str.charAt(j)=='0')
                        c+=6;
                    else if(str.charAt(j)=='1')
                        c+=2;
                    else if(str.charAt(j)=='2')
                        c+=5;
                    else if(str.charAt(j)=='3')
                        c+=5;
                    else if(str.charAt(j)=='4')
                        c+=4;
                    else if(str.charAt(j)=='5')
                        c+=5;
                    else if(str.charAt(j)=='6')
                        c+=6;
                    else if(str.charAt(j)=='7')
                        c+=3;
                    else if(str.charAt(j)=='8')
                        c+=7;
                    else if(str.charAt(j)=='9')
                        c+=6;
                }
                if(c<min){
                    min=c;
                    res=x;
                }
               
            }
             System.out.println(a[res]);
        }
    }
}
