package 수학1;

import java.util.*;
import java.io.*;

public class BOJ2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        int sum = 0;

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == target) {
                        max = sum;
                        break;
                    }
                    if (sum <= target && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

