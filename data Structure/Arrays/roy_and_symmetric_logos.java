/*
https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/roy-and-symmetric-logos-1/
*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        for(int x=0;x<tests;x++){
            int size=sc.nextInt();
            String str[] = new String[size];
            for(int i=0;i<str.length;i++){
                str[i]=sc.next();
            }
            int len=0;
            if(str.length%2==0){
                len=str.length/2;
            }
            else{
                len=str.length/2+1;
            }
            boolean status=true;
            for(int i=0;i<len;i++){
                StringBuilder sb= new StringBuilder();
                sb.append(str[i]).reverse();
                if(!str[i].equals(sb.toString()) || !str[i].equals(str[size-i-1])){
                    status=false;
                    break;
                }
                // else{

                // }
            }
            if(status){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}
