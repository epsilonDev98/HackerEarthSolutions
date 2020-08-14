/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/b-39/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]= new int[size];
        int barr[] = new int[size];
        int carr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<barr.length;i++){
            barr[i]=sc.nextInt();
        }
        long count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    carr[j]+=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length;k++){
                if(arr[i]<barr[k]){
                    count=count+carr[i];
                }
            }
        }
        System.out.println(count);
    }
}
