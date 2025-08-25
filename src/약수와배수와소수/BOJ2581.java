package 약수와배수와소수;

import java.util.*;
import java.io.*;

public class BOJ2581 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i=n; i<=m; i++) {
            if (isPrime(i)) {
                if (i < min) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i=2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
