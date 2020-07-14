/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/city-travel-59bad87f/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int x=sc.nextInt();
        int n=sc.nextInt();
        int[] t=new int[n];
        int[] y=new int[n];
        int i;
        int j=0,temp;
        boolean status=false;
        for( i=0;i<n;i++){
            t[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        //  for( i=0;i<n;i++){
        //    // t[i]=sc.nextInt();
        //     y[i]=sc.nextInt();
        // }
        // Arrays.sort(t);
        // Arrays.sort(y);
        for(i=0;i<t.length;i++){
            for(j=i+1;j<t.length;j++){
                if(t[j]<t[i]){
                    temp=t[j];
                    t[j]=t[i];
                    t[i]=temp;

                    temp=y[j];
                    y[j]=y[i];
                    y[i]=temp;
                }
            }
        }
        j=0;
        for( i=1;s>0;i++){
            status=false;
            for(;j<t.length && t[j]<=i;j++){
                if(i==t[j]){
                    s-=y[j];
                    status=true;
                    break;
                }
            }
            if(status==false){
                s-=x;
            }
        }
        
        System.out.println(--i);

    }
}
