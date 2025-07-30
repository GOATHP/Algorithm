package 그리디알고리즘;

import java.util.*;
import java.io.*;

public class BOJ13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        int target = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] dist = new int[n-1];
        int[] town = new int[n];
        for (int i=0; i < n - 1; i++) {
            int m = Integer.parseInt(st.nextToken());
            dist[i] = m;
            target += m;
        }
        for (int i=0; i < n; i++) {
            int m = Integer.parseInt(st2.nextToken());
            town[i] = m;
        }


        for (int i=0; i < dist.length; i++ ) {
            for (int j=i+1; j < dist.length; j++ ) {
                if (target == 0) { break;}
                if (town[i] <= town[j]) {
                    total += (town[i]+town[j]) * dist[i];
                    target -= dist[i];
                } else if (town[i] > town[j]) {
                    total += (town[i]+town[j]) * dist[j];
                    target -= dist[i];
                }
            }
        }



        System.out.println(total);
    }


}
