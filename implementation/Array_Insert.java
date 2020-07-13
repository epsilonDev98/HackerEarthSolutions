/*
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/array-insert/
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().trim().split(" ");
        int N = Integer.parseInt(numbers[0]);
        int Q = Integer.parseInt(numbers[1]);
        String[] arr = br.readLine().trim().split(" ");
        int[] inputArray = new int[N];
        for(int i = 0; i < N; i++)
            inputArray[i] = Integer.parseInt(arr[i]);
        while(Q-- > 0) {
            String[] query = br.readLine().trim().split(" ");
            int qtype = Integer.parseInt(query[0]);
            int num1 = Integer.parseInt(query[1]);
            int num2 = Integer.parseInt(query[2]);
            if(qtype == 1) {
                inputArray[num1] = num2;
            }
            else {
                int sum = 0;
                for(int i = num1; i <= num2; i++) {
                    sum += inputArray[i];
                }
                System.out.println(sum);
            }
        }

    }
}
