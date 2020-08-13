/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/baaki-che/
*/


import java.util.*;
class TestClass {
    static void sortScore(int score[],String name[]){
        for(int i=1;i<score.length;i++){
            int k=score[i];
            String n=name[i];
            int j=i-1;
            while(j>=0 && score[j]<k){
                score[j+1]=score[j];
                name[j+1]=name[j];
                j--;
            }
            score[j+1]=k;
            name[j+1]=n;
        }
    }
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc =  new Scanner(System.in);
        int tests= Integer.parseInt(sc.nextLine());
        String[] names= new String[tests];
        int[] score= new int[tests];
        for(int i=0;i<tests;i++){
            String str[]=sc.nextLine().split(" ");
            names[i]= str[0];
            score[i]=Integer.parseInt(str[1]);
            // int value = Integer.parseInt(str.replaceAll("[^0-9]", ""));
            // System.out.println(value);

        }
        sortScore(score,names);
        for(int j=0;j<3;j++){
            System.out.println(names[j]);
        }
        
    }
}
