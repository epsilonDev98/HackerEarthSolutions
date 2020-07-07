/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/mojtaba-prepares-contest-29b2a044/

*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests =sc.nextInt();
        int costg=0;
        int costp=0;
        int team;
 
        for(int i=0;i<tests;i++){
               costg=sc.nextInt();
               costp=sc.nextInt();
                team=sc.nextInt();
            int result=0;
            int countg=0;
            int countp=0;
            int arr[][]= new int[team][2];
            for(int j=0;j<team;j++){
                for(int k=0;k<2;k++){
                    arr[j][k]=sc.nextInt();
                }
            }
            for(int j=0;j<team;j++){
                if(arr[j][0]==1){
                    countg++;
                }
                if(arr[j][1]==1){
                    countp++;
                }
            }
            if(countg>countp){
                if(costg>costp){
                    result=costg*countp+costp*countg;
                }else{
                    result=costg*countg+costp*countp;
                }
            }
            else{
                if(costg>costp){
                    result=costg*countg+costp*countp;
                }
                else{
                   result=costg*countp+costp*countg; 
                }
            }
            System.out.println(result);
        }
    }
}
