/* I
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/warcakewalk/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                
        for(int j=1;j<=t;j++)
         {  int n = sc.nextInt(); 
            int B[]=new int[n];
            int A[]=new int[n];
            int bob=0;
            int alice=0;
            int c1=0;
            int c2=0;
            for(int i=0;i<n;i++)
             {
                 B[i]=sc.nextInt();
             }
              for(int i=0;i<n;i++)
             {
                 A[i]=sc.nextInt();
             }
             Arrays.sort(B);
             Arrays.sort(A);
             if(B[n-1]>A[n-1])
              {System.out.println("Bob");}
             if(B[n-1]<A[n-1])
              {System.out.println("Alice");}
            if (B[n-1]==A[n-1])
              {System.out.println("Tie");}
            
         }
 
    }
}
