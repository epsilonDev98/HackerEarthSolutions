/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/tds-and-his-breakup/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int minSkill= sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>=minSkill){
                System.out.println("YES");
                
            }
            else{
                System.out.println("NO");
                
            }
        }

    }
}
