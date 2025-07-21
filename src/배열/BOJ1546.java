package 배열;

import java.util.*;
import java.io.*;

public class BOJ1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double[] arr = new double[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        double sum = 0;
        double avg = 0;

        for (int i=0; i<n; i++) {

                arr[i] = (arr[i]/max)*100;

            sum += arr[i];
        }

        avg = sum / n;

        System.out.println(avg);
    }
}
