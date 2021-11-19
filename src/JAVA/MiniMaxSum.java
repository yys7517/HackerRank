package JAVA;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSum_JAVA_Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

class MiniMaxSum_JAVA_Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long minSum = 0;
        long maxSum = 0;
        Collections.sort( arr );

        for ( Integer value : arr ) {
            sum += value;
        }
        minSum = sum - arr.get( arr.size()-1 );
        maxSum = sum - arr.get( 0 );

        System.out.print(minSum +" " + maxSum);
    }

}


