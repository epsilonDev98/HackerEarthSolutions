/*

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];  
        long product=1;
        
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            product = (product*num[i])%((long)Math.pow(10,9)+7);
        }
        System.out.println(product);
 
    }
}