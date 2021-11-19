package JAVA;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class PlusMinus_Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int plus = 0;
        int zero = 0;
        int minus = 0;

        for ( int value : arr ) {
            if ( value > 0 )
                plus++;
            else if( value == 0 )
                zero++;
            else if ( value < 0 )
                minus++;
        }

        double [] result = new double[3];
        result[0] = (double)plus / arr.size();
        result[1] = (double)minus / arr.size();
        result[2] = (double)zero / arr.size();

        for (int i = 0; i <3; i++) {
            System.out.printf("%.6f\n", result[i]);
        }

    }

}

public class PlusMinus
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus_Result.plusMinus(arr);

        bufferedReader.close();
    }
}





