/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/addition-aint-simple/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<=n;i++){
            String str=sc.nextLine();
            //char[] ch=str.toCharArray();
           int len=str.length();
            for(int j=0;j<len;j++){
                //sum=ch[j]+ch[q]-2*96;
                int sum=0;
                int x=str.charAt(j);
                int y=str.charAt(len-1-j);
                sum=x+y-96;
                if(sum>122){
                    sum=sum-122+96;
                }
                System.out.print((char)sum);
            }
            System.out.println();
        }

    }
}
