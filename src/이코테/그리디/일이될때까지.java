package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 일이될때까지 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (n != 1) {

            if (n % k == 0) {
                n = n/k;
                cnt++;
            } else {
                n--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
