/8
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/count-numbers-46/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int count=0;
            int len=sc.nextInt();
            String str=sc.next();
            String temp=str+"aaa";
            for(int j=0;j<len;j++)
            {
                boolean dig=Character.isDigit(temp.charAt(j));
                boolean alpha=Character.isAlphabetic(temp.charAt(j+1));
                if(dig==true && alpha==true){
                    count+=1;
                }
                else{
                    continue;
                }
                
            }
            System.out.println(count);
        }
    }
}
