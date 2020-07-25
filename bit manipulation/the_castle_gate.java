/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/the-castle-gate-july-easy/
*/




import java.util.*;
class TestClass {
    static boolean xorCheck(int num,int x,int y){
        boolean status=false;
        if((x^y)<=num)
            return true;
        else
            return false;
    }
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int k=0;k<tests;k++){
            int num=sc.nextInt();
            // int l=1;
            // int h=num;
        
        int count=0;
        for(int i=1;i<=num;i++){
            for(int j=i+1;j<=num;j++){
                if(xorCheck(num,i,j)){
                    count++;
                }
            }
        }
        System.out.println(count);
        }

    }
}
