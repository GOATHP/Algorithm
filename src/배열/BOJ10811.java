package 배열;

import java.util.*;
import java.io.*;

public class BOJ10811 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i=1; i <= n; i++) {
            arr[i-1] = i;
        }

        while (m > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            for (int k=i; k<=j ; k++) {
                int temp = arr[i];
                arr[k] = arr[j];
                arr[j] = temp;
                if (j > k) {
                    j--;
                } else {
                    return;
                }
            }
            m--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
