/*


https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/anagrams-651/

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {

 
        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests=Integer.parseInt(br.readLine());
        for(int i=0;i<tests;i++){
            int count=0;
        String str1 = br.readLine(); 
        String str2 = br.readLine();
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        
        
        for(int j=0;j<str1.length();j++){
            for(int k=0;k<str2.length();k++)
            {
                if(a[j]==b[k])
                {
                    b[k]='-';
                    count++;
                    break;
                }
            }
        } 
        System.out.println((str1.length()+str2.length())-(2*count));          
        }
 
        
        
    }
}
