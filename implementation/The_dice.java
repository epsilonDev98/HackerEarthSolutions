/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-dice-d4dc5b11/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char ch[] =str.toCharArray();
        int count=0;
        if(ch[ch.length-1]=='6'){
             System.out.println("-1");
        }
        else{
             for(int i=0;i<ch.length;i++){
            if(ch[i]!='6'){
                count++;
            }
            else{
              count+=0; 
            }
        }
        System.out.println(count);
        }
       
    }
}
