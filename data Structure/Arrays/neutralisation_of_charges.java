/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charges-repel/
*/


import java.util.*;

class TestClass { 
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        String str=sc.next();
        Stack<String> st= new Stack<>();
        //int[] freq = new int[26]; 
        for (int i = 0; i <len; i++){
            String ch=str.charAt(i)+"";
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(st.peek().equals(ch)){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        System.out.println(st.size());
        for (int i = 0; i <st.size(); i++) { 
                System.out.print(st.get(i)); 
            } 
    }
}
