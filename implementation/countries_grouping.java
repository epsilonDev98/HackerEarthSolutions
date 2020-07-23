
/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/countries-grouping-1-5b13620a/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();

            }
            Arrays.sort(arr);
            boolean status=true;
            int count=0;
            int j=0;
            
            for(int i=0;i<size;i++)
            {
                int no=arr[i];
                try{
                for( j=i;j<(i+no);j++){
                    if(arr[j]!=no){
                        status=false;
                        break;
                    }
                }}
                catch(Exception e){
                    status=false;
                }
                //count++;
                i=j-1;
                if(status==true)
                    count++;
            }
            if(status==false)
                System.out.println("Invalid Data");
            else
                System.out.println(count);
        }

    }
}
