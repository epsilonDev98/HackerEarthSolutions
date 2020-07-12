/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cipher-1/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            Character ch =str.charAt(i);
            int l=ch;
            int r;
            if(Character.isLetter(ch)){
                if(l>=97&&l<=122){
                l+=k-97;
                l%=26;
                l+=97;
            }
            else{
                l+=k-65;
                l%=26;
                l+=65;

            }
            sb.append((char)l);
        } else if(Character.isDigit(ch)){
            l=Character.getNumericValue(ch);
            l+=k;
            l%=10;
            sb.append(l);
        }
        // else if(Character.isDigit(ch)){
        //     l=Character.getNumericValue(ch);
        //     l+=k-65;
        //     l%=26;
        //     sb.append(l);
        // }
        else{
            sb.append(ch);
        }
        }
System.out.println(sb);
    }
}
