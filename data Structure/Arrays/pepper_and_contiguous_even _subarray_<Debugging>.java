/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pepper-and-contiguous-even-subarray-9f3adf65/
*/


import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] inp = br.readLine().split(" ");
            int[] A=new int[N];
            for(int i=0;i<N;i++)
            {
                A[i] = Integer.parseInt(inp[i]);
            }
            int ans = solve(N, A);
            System.out.println(ans);
         }

         wr.close();
         br.close();
    }
    static int solve(int N, int[] A) {
        //editable area
        int ans=0;
        int cnt=0;
        for(int i=0;i<N;i++) {
            if(A[i]%2==0) cnt++;
            else {
                ans=Math.max(ans,cnt);
                cnt=0;
            }
        }
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
        // add these lines only
        ans =Math.max(ans,cnt);
        if(ans==0)
        ans=-1;
        return ans;
    }
}
