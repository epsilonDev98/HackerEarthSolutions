/*
https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/jadvaliioo-62280ff6/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String str=sc.nextLine();
        char ch[][]= new char[n][m];
        for(int i=0;i<n;i++){
            str=sc.nextLine();
            for(int j=0;j<m;j++){
                ch[i][j]=str.charAt(j);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j]=='s'){
                    if(j+3<m){
                        if(ch[i][j+1]=='a' && ch[i][j+2]=='b' && ch[i][j+3]=='a'){
                            count++;
                        }
                    }
                    if(i+3<n){
                        if(ch[i+1][j]=='a' && ch[i+2][j]=='b' && ch[i+3][j]=='a'){
                            count++;
                        }
                    }
                    if(i+3<n && j+3<m){
                        if(ch[i+1][j+1]=='a' && ch[i+2][j+2]=='b' && ch[i+3][j+3]=='a'){
                            count++;
                        }
                    }
                     if(j+3<m && i-3>=0){
                        if(ch[i-1][j+1]=='a' && ch[i-2][j+2]=='b' && ch[i-3][j+3]=='a'){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
