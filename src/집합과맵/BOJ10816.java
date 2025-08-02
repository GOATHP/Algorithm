package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {

            int key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {

            int k = Integer.parseInt(st2.nextToken());
            arr[i] = k;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<m; i++) {
            if (map.containsKey(arr[i])) {
                sb.append(map.get(arr[i]) + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }

}
