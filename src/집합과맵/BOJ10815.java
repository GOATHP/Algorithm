package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        int[] ansArr = new int[m];
        for (int i=0; i<n; i++) {
            int key = Integer.parseInt(st.nextToken());
            map.put(key, 1);
        }
        for (int i=0; i<m; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        for (int key : arr) {
            if (map.containsKey(key)) {
                System.out.print(1+" ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
