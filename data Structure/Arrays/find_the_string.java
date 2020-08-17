/*
https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/find-the-string-4014dec6/

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            char[][] charray=new char[n][m];
            for(int j=0;j<n;j++){
                String str=sc.next();
                for(int k=0;k<m;k++){
                    charray[j][k]=str.charAt(k);
                }
            }
            int[][] narr=new int[n][m];
            boolean status=false;
            String st=sc.next();
            char ch[]= st.toCharArray();
            int x=0;
            for(int j=0;j<ch.length;j++){
                int rem=x%n;
                status=false;
                char c=ch[j];
                for(int k=0;k<m;k++){
                    if(charray[rem][k]==c){
                        status=true;
                        charray[rem][k]='\n';
                        break;
                    }
                }
                if(!status){
                    break;
                }
                x++;
            }

            if(status){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
