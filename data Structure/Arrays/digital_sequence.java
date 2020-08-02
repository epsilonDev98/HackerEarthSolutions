/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/digitial-sequence-ee0ea080/
*/


import java.util.*;
class TestClass {
    static void checkDig(int[] a,int num){
        boolean temp[]= new boolean[10];
        while(num!=0){
            if(temp[num%10]==false){
                a[num%10]++;
                temp[num%10]=true;
            }
            num/=10;
        }
        
    }
    public static void main(String args[] ) throws Exception {
        

        // Write your code here
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        
        int res=0;
        int digit[]= new int[10];
        for(int i=0;i<size;i++){
            int num=sc.nextInt();
            checkDig(digit,num);
        }
        for(int i=0;i<10;i++){
            res=Math.max(digit[i],res);
        }
        System.out.println(res);

    }
}
