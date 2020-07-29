/* 
https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/chinu-and-his-project/
*/

 
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;;i++){
            if((i^(i>>1))==num){
                System.out.println(i);
                break;
            }
        }

    }
}
