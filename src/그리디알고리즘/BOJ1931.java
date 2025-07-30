package 그리디알고리즘;

import java.util.*;
import java.io.*;

public class BOJ1931 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        HashMap<Integer, long[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long start = Long.parseLong(st.nextToken());
            long end = Long.parseLong(st.nextToken());
            long[] arr = new long[2];
            arr[0] = start;
            arr[1] = end;
            map.put(i, arr);
        }
        for (int i = 0; i < n; i++) {
            long start = map.get(i)[0];
            long end = map.get(i)[1];

            for (int j = i + 1; j < n; j++) {
                long nextStart = map.get(j)[0];
                long nextEnd = map.get(j)[1];
                if (nextStart >= end) {
                    cnt += 1;
                    i = j-1;

                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
