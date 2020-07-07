/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/

*/




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement implements IPracticeSolution {


    @Override
    public void startSolution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int tests= Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tests; i++) {
            int sno = Integer.parseInt(bufferedReader.readLine());

            switch (sno % 12) {
 		case 0:
                    System.out.println(sno - 11 + " WS");
                    break;
                case 1:
                    System.out.println(sno + 11 + " WS");
                    break;
                case 2:
                    System.out.println(sno + 9 + " MS");
                    break;
                case 3:
                    System.out.println(sno + 7 + " AS");
                    break;
                case 4:
                    System.out.println(sno + 5 + " AS");
                    break;
                case 5:
                    System.out.println(sno + 3 + " MS");
                    break;
                case 6:
                    System.out.println(sno + 1+ " WS");
                    break;
                case 7:
                    System.out.println(sno - 1 + " WS");
                    break;
                case 8:
                    System.out.println(sno - 3 + " MS");
                    break;
                case 9:
                    System.out.println(sno - 5 + " AS");
                    break;
                case 10:
                    System.out.println(sno - 7 + " AS");
                    break;
                case 11:
                    System.out.println(sno - 9 + " MS");
                    break;
               
            }
        }
    }


}