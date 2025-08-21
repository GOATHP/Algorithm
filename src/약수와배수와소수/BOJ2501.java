package 약수와배수와소수;

import java.util.*;
import java.io.*;

public class BOJ2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int y = 0;
        for (int i=1; i<=N; i++) {

            if (N % i == 0) {
                cnt += 1;
                if (cnt == k) {
                    y=i;
                    break;
                }
            }
        }
        if (cnt == k) {
            System.out.println(y);
        } else if (cnt < k) {
            System.out.println(0);
        }
    }

}
