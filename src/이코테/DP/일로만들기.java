package 이코테.DP;

import java.util.*;
import java.io.*;

public class 일로만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MIN_VALUE;

        System.out.println(divBy(n, 0));



    }


    public static int divBy(int n, int cnt) {

        if (n == 1) {
            return cnt;
        }

        if (n % 5 == 0) {
            cnt++;
            return divBy(n / 5, cnt);
        } else if (n % 3 == 0) {
            cnt++;
            return (divBy(n / 3, cnt));
        } else if (n % 2 == 0) {
            cnt++;
            return (divBy(n / 2, cnt));
        } else {
            cnt++;
            return (divBy(n - 1, cnt));
        }
    }
}
