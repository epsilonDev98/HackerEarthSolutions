/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/counting-the-subarrays-4187713a/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]= new int[size];
        long sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int count=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            double temp=0;
            int len=0;
            for(int j=i;j<arr.length;j++){
                temp+=arr[j];
                len++;
                if(arr.length==len || temp/len>(sum-temp)/(size-len)){
                    sb.append((i+1)+" "+(j+1)+"\n");
                    count++;
                }
            }

        }
        System.out.println(count);
        System.out.println(sb.toString());
        

    }
}
