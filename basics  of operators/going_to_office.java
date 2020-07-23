/* 
https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/going-to-office-e2ef3feb/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc =new Scanner(System.in);
        int dis=sc.nextInt();
        sc.nextLine();
        long oc=sc.nextLong();
        long of=sc.nextLong();
        long od=sc.nextLong();
        sc.nextLine();
        long cs=sc.nextLong();
        long cb=sc.nextLong();
        long cm=sc.nextLong();
        long cd=sc.nextLong();
        long a=(oc+(dis-of)*od);
        long b=(((dis/cs)*cm)+(dis*cd)+cb);
        if(a>b)
            System.out.println("Classic Taxi");
        else if(a<b)
            System.out.println("Online Taxi");
        else
            System.out.println("Online Taxi");
        


    }
}
