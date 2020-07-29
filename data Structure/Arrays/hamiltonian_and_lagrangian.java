/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/hamiltonian-and-lagrangian/
*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int j=0;
        for(int i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]<arr[j])
                    break;
            }
            if(j==size)
                System.out.print(arr[i]+" ");
            
        }
        
    }
}
