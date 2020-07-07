/*

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        int res=1,i=1;
        if(number==0){
            System.out.println(res);
        }
        while(i<=number){
            res=res*i;
            i++;
 
        }
        System.out.println(res);
 
    }
}
