/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/city-group-3/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] S=new int[N+1];
        for(int i=1;i<=K;i++)
        {
            int a=sc.nextInt();
          
            for(int k=1;k<=a;k++)
            {
                S[sc.nextInt()] = i;
            }
        }
        int Q=sc.nextInt();

        for(int k=0;k<Q;k++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
 
            System.out.println(Math.min(Math.abs(S[y] - S[x]), K-Math.abs(S[y]-S[x])));
                
        
        }


    }
}
