/*
https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/the-wealthy-landlord/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[1003][1003];
        for(int i=0;i<n;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int cost=sc.nextInt();
            for(int j=x1;j<=x2;j++){
                for(int k=y1;k<=y2;k++){
                    if(arr[j][k]==0){
                        arr[j][k]+=cost;
                    }
                    else if(arr[j][k]>0){
                        arr[j][k]=(-1)*(arr[j][k]+cost);
                    }
                    else{
                        arr[j][k]=arr[j][k]-cost;
                    }
                }
            }
        }
            long sum=0;
            for(int j=1;j<=1001;j++){
                for(int k=1;k<=1001;k++){
                    if(arr[j][k]<0){
                        sum+=arr[j][k];
                    }
                }
               
            }
            
         System.out.println((-1)*(sum));
        

    }
}
