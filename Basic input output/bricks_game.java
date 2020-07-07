/*

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/bricks-game-5140869d/

*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int bricks = sc.nextInt();
        int sum=0;
        for(int i=1;;i++){
            sum+=i;
            if(sum>bricks){
                System.out.print("Patlu");
                break;
            }
            sum=sum+2*i;
            if(sum>bricks){
                System.out.print("Motu");
                break;
            }
        }
    }
}
