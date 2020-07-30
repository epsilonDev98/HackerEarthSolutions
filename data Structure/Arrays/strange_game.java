/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/strange-game-1-7e758acb-1bff10f0/
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int tests = Integer.parseInt(s);
        for(int i = 0; i < tests; i++){
            String s1[] = br.readLine().split(" ");
            int size = Integer.parseInt(s1[0]);
            int sec = Integer.parseInt(s1[1]);
            s1 = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");
            int arr1[] = new int[size];
            int arr2[] = new int[size];
            for(int j = 0; j < size; j++){
                arr1[j] = Integer.parseInt(s1[j]);
                arr2[j] = Integer.parseInt(s2[j]);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int temp = arr2[size-1];
            long result = 0;
            for(int j = 0; j < size; j++){
                if(temp >= arr1[j]){
                    result += (temp - arr1[j] + 1)*sec;
                }else{
                    break;
                }
            }
            System.out.println(result);

        }

    }
}
