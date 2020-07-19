/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/alice-and-string-game-dbd6adc3/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            String str=sc.next();
            int ch[] =new int[26]; 
            char s[] =str.toCharArray();   
            int count=0;                
            for(int j=0;j<s.length;j++){
                if(ch[s[j]-'a']==0){
                    ch[s[j]-'a']=1;
                    count++;
                }
                
                    
            }
            if(count%2==0){
                System.out.println("Player2");
            }
            else{
                System.out.println("Player1");
            }
        }

    }
}
