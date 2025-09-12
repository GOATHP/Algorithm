package 이코테.DP;

import java.util.*;
import java.io.*;

public class 개미전사 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n];
        int max = arr[0] + arr[2];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }
//
//    public static int dp(int[] arr, int max, int x) {
//
//        for (int i = 0; i<n; )
//        max = Math.max(max, arr[0] + arr[3]);
//        arr[1] + arr[n]
//
//
//        return max;
//    }

}
