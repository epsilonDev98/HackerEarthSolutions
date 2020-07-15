/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/hawkeye-and-floodfill/
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row=Integer.parseInt(br.readLine());
        String str=br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int i=Integer.parseInt(st.nextToken());
        int j=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
     
        for(int x=0;x<row;x++){
            for(int y=0;y<row;y++){
                int res=Math.max(Math.abs(i-x),Math.abs(j-y));
                int result=p-res;
                if(result<0){
                       result=0;
                }
             
                System.out.print(result+" ");
            }
            System.out.println();
        }

    }
}
