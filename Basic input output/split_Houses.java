/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int noVillage=sc.nextInt();
        String str = sc.next();
        String[] arr =str.split("");
        int count=0;
       if(arr[0].equals("."))
            arr[0]="B";
 
        for(int i=1;i<noVillage;i++){
            if(arr[i].equals("H")&&arr[i-1].equals("H")){
                System.out.print("NO");
                break;
            }
            else{
                if(arr[i].equals(".")){
                    arr[i]="B";
                }
            }
            count++;
        }
        if(count==noVillage-1){
            System.out.println("YES");
            for(int i=0;i<noVillage;i++)
            {
            System.out.print(arr[i]);
            }
        }
 
 
    }
}
