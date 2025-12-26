package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 볼링공고르기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int target = arr[i];
            for (int j = i; j<n; j++) {
                if (arr[j] != arr[i]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
