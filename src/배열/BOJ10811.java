package 배열;

import java.util.*;
import java.io.*;

public class BOJ10811 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        for (int k = 0; k < m; k++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken()) - 1;
            int j = Integer.parseInt(st2.nextToken()) - 1;

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(arr[i - 1]+ " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
