/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/binary-associativity-fc8ca73f/
*/


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        int[] c= new int[4];
        for(int j=0;j<tests;j++){
            int x=0;
            for(int i=0;i<c.length;i++){
                c[i]=sc.nextInt();
            }
            if(c[1]==c[2])
                x=x+1;
            if((c[3]==0) && (c[2]==0) && (c[0]==c[2]))
                x=x+1;
            else if((c[3]==0) && (c[2]==1) &&(c[0]==c[3]))
                x=x+1;
            else if((c[3]==0 )&&( c[2]==1 )&&(c[0]==c[3]))
                x=x+1;
            else if ((c[3]==1)&&(c[2]==0))
                x=x+1;
            else if ((c[3]==1)&&(c[2]==1)&&(c[2]==c[3]))
                x=x+1;
            else
                x=x;
            if ((c[3]==0)&&(c[1]==1))
                x=x+1;
            else if ((c[3]==0)&&(c[1]==0)&&(c[0]==c[1]))
                x=x+1;
            else if ((c[3]==1)&&(c[1]==0))
                x=x+1;
            else if( (c[3]==1)&&(c[1]==1)&&(c[1]==c[3]))
                x=x+1;
            else
                x=x;
            if ((c[0]==0)&&(c[1]==1))
                x=x+1;
            else if ((c[0]==0)&&(c[1]==0)&&(c[0]==c[1]))
                x=x+1;
            else if ((c[0]==1)&&(c[1]==0)&&(c[0]==c[3]))
                x=x+1;
            else if ((c[0]==1)&&(c[1]==1)&&(c[3]==c[1]))
                x=x+1;
            else
                x=x;
            if ((c[2]==1)&&(c[0]==0))
                x=x+1;
            else if ((c[2]==0)&&(c[0]==0)&&(c[0]==c[2]))
                x=x+1;
            else if ((c[2]==0)&&(c[0]==1)&&(c[0]==c[3]))
                x=x+1;
            else if ((c[2]==1)&&(c[0]==1)&&(c[3]==c[2]))
                x=x+1;
            else
                x=x;
            if ((x==5)||((c[0]==0)&&(c[1]==0)&&(c[2]==1)&&(c[3]==1))||((c[0]==0)&&(c[1]==1)&&(c[2]==0)&&(c[3]==1)))
                System.out.println("Yes");
            else
                 System.out.println("No");

        }


    }
}
