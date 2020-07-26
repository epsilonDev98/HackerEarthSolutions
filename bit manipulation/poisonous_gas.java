/*
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/hunny-bunny-eebee22a/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int size=sc.nextInt();
            int sum=0;

            int count=0;
            for(int j=0;j<size;j++){
                int num=sc.nextInt();
                if(num>0)
                    sum+=num;
            }
            while(sum!=0){
                count++;
                sum=sum&(sum-1);
                //count++;
            }
            if(count==1)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
