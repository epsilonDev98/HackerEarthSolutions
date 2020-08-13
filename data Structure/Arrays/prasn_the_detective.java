/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/prasun-the-detective-77f90f8f/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        String ques= sc.nextLine().trim();
        String ans=sc.nextLine().trim();
        ques=ques.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        ans=ans.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char q[] =ques.toCharArray();
        char[] a=ans.toCharArray();
        if(q.length!=a.length){
            System.out.println("NO");
        }
        Arrays.sort(q);
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=q[i]){
                System.out.println("NO");
                break;
            }
        }
        System.out.println("YES");

    }
}
