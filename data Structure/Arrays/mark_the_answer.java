/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/mark-the-answer-1/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int limit=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(temp>1){
                break;
            }
            if(arr[i]<=limit){
                count++;
            }
            else if(arr[i]>limit){
                temp++;
                continue;
            }
        }
    System.out.println(count);
    }
}
