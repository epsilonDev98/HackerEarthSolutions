/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/arithmetic-progression-1-81131fa7/
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests= Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();
        for(int x=0;x<tests;x++){
            String arr[]=br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b=  Integer.parseInt(arr[1]);
            int c=  Integer.parseInt(arr[2]);
           // int d1=b-a;
           // int d2=c-b;
            int diff = (Math.abs((c-b)-(b-a))+1)/2;
            //int d =Math.round(diff+1/2);
            out.append(diff+"\n");
        }
        System.out.println(out);

    }
}
