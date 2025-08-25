package 약수와배수와소수;

import java.util.*;
import java.io.*;

public class BOJ1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        int isPrime = 0;
        for (int i=0; i<n; i++) {
            isPrime = 0;
            int m = Integer.parseInt(st.nextToken());
            for (int j=2; j<m; j++) {
                if (m % j == 0) {
                    break;
                } else {
                    isPrime = 1;
                }
            }
            if (isPrime == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
