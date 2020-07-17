/* 
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/complete-the-syllabus/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int i=0;i<tests;i++){
            int k=sc.nextInt();
            int[] a=new int[7];
            int c=0;
            for(int j=0;j<7;j++){
                a[j]=sc.nextInt();
                c+=a[j];
            }
            int rem=k%c;
            int res=-1;
            if(rem==0){
                for(int j=6;j>=0;j--){
                    if(a[j]>0){
                        res=j;
                        break;
                    }
                }
            }
            else{
                while(rem>0){
                    for(int j=0;j<7;j++){
                        rem-=a[j];
                        if(rem<=0){
                            res=j;
                            break;
                        }
                    }
                }
            }
            if(res==0)
                System.out.println("MONDAY");
            else if(res==1)
                 System.out.println("TUESDAY"); 
            else if(res==2)
                 System.out.println("WEDNESDAY"); 
            else if(res==3)
                 System.out.println("THURSDAY");  
            else if(res==4)
                 System.out.println("FRIDAY");  
            else if(res==5)
                 System.out.println("SATURDAY");   
            else if(res==6)
                 System.out.println("SUNDAY");    
        }
    }
}
