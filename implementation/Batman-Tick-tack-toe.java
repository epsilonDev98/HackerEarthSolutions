/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/batman-and-tick-tack-toe/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {


        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        char[] c=new char[16];
        for(int i=0;i<tests;i++)
        {
            int l=0;
            int count2=0;
            for(int j=0;j<4;j++)
            {
                String name =sc.next();
                for(int k=0;k<4;k++)
                {
                    c[l]=name.charAt(k);    
                    l++;              
                }
            }
            for(int x=0;x<14;x++)
            {
                int count=0,count1=0;
                if(x==2)
                {
                    x=4;
                }
                if(x==6)
                {
                    x=8;
                }
                if(x==10)
                {
                    x=12;
                }
                if(c[x]=='x')
                {
                    count++;
                }
                if(c[x+1]=='x')
                {
                    count++;
                }
                if(c[x+2]=='x')
                {
                    count++;
                }
                 if(c[x]=='.')
                {
                    count1++;
                }
                if(c[x+1]=='.')
                {
                    count1++;
                }
                if(c[x+2]=='.')
                {
                    count1++;
                }
                if(count==2&&count1==1)
                {
                    //System.out.println("1YES"+x);
                    count2++;
                    break;
                }
            }
            for(int x=0;x<8;x++)
            {
                int count=0,count1=0;
                if(c[x]=='x')
                {
                    count++;
                }
                if(c[x+4]=='x')
                {
                    count++;
                }
                if(c[x+8]=='x')
                {
                    count++;
                }
                 if(c[x]=='.')
                {
                    count1++;
                }
                if(c[x+4]=='.')
                {
                    count1++;
                }
                if(c[x+8]=='.')
                {
                    count1++;
                }
                if(count==2&&count1==1)
                {
                    //System.out.println("2YES");
                    count2++;
                    break;
                }
            }
            for(int x=0;x<6;x++)
            {
                int count=0,count1=0;
                if(x==2)
                {
                    x=4;
                }
                if(c[x]=='x')
                {
                    count++;
                }
                if(c[x+5]=='x')
                {
                    count++;
                }
                if(c[x+10]=='x')
                {
                    count++;
                }
                 if(c[x]=='.')
                {
                    count1++;
                }
                if(c[x+5]=='.')
                {
                    count1++;
                }
                if(c[x+10]=='.')
                {
                    count1++;
                }
                if(count==2&&count1==1)
                {
                    //System.out.println("3YES");
                    count2++;
                    break;
                }
            }
            for(int x=2;x<8;x++)
            {
                int count=0,count1=0;
                if(x==4)
                {
                    x=6;
                }
                if(c[x]=='x')
                {
                    count++;
                }
                if(c[x+3]=='x')
                {
                    count++;
                }
                if(c[x+6]=='x')
                {
                    count++;
                }
                 if(c[x]=='.')
                {
                    count1++;
                }
                if(c[x+3]=='.')
                {
                    count1++;
                }
                if(c[x+6]=='.')
                {
                    count1++;
                }
                if(count==2&&count1==1)
                {
                    //System.out.println("4YES");
                    count2++;
                    break;
                }
            }
            if(count2>0)
            {
                System.out.println("YES");
            }
            else if(count2==0)
            {
                System.out.println("NO");
            }
        }     

    }
}
