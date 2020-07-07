/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        for(int i=0;i<tests;i++){
            boolean status=false;
            String str1 =sc.next();
            String str2 =sc.next();
            if(str1.length()!=str2.length())
            status=false;
            
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int j=0;j<str1.length();j++){
                if(arr1[j]!=arr2[j]){
                    status=false;
                    break;
                }
                else{
                    status=true;
                }
            }
            if(status==false){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }

    }
}
