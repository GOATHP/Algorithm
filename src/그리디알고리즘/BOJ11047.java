package 그리디알고리즘;

import java.util.*;
import java.io.*;

public class BOJ11047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int coinNum = Integer.parseInt(st.nextToken());
        int[] arr = new int[coinNum];
        int target = Integer.parseInt(st.nextToken());
        int remain = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < coinNum; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < coinNum; i++) {
            map.put(i, arr[i]);

        }

        int cnt = 0;
        for (int i = coinNum-1 ; i >= 0; i--) {
            if (map.get(i) <= target) {
                cnt += target / map.get(i);
                target = target % map.get(i);
            }
        }
        System.out.println(cnt);
    }
}
