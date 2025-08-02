package 브루트포스;

import java.util.*;
import java.io.*;

public class BOJ2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int target = Integer.parseInt(n);
        int answer = 0;

        for (int i = 1; i <= target; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == target) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
