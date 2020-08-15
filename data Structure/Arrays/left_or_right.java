/*
https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/left-or-right-92c0b54c/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            int y=sc.nextInt();
            int z=sc.nextInt();
            char m=sc.next().charAt(0);
            int d=-1;
        if(m=='L')
        {
            for(int k=y;k>=0;k--)
            {
                if(a[k]==z)
                {
                    d=k;
                    break;
                }
            }
            if(d==-1)
            {
                for(int k=n-1;k>y;k--)
                {
                   if(a[k]==z)
                    {
                        d=k;
                        break;
                    }
                }
                if(d==-1)
                    System.out.println("-1");
                else    
                System.out.println(y+n-d);
            }
            else
            System.out.println(y-d);
        }
        else if(m=='R')
        {
            for(int k=y;k<n;k++)
            {
                if(a[k]==z)
                {
                    d=k;
                    break;
                }
            }
            if(d==-1)
            {
                for(int k=0;k<y;k++)
                {
                    if(a[k]==z)
                    {
                        d=k;
                        break;
                    }  
                }
                if(d==-1)
                System.out.println("-1");
                else if(d==0)
                System.out.println(n-y);
                else
                System.out.println(n-y+d);
            }
            else
            System.out.println(d-y);
        }

    }
}
}
