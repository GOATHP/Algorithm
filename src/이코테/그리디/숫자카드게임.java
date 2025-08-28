package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 숫자카드게임 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                Arrays.sort(arr[i]);
            }
        }

        for (int i=0; i<n; i++) {
            if (max < arr[i][0]) {
                max = arr[i][0];
            };
        }
        System.out.println(max);
    }
}

