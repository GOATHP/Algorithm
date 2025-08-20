package 수학1;

import java.util.*;
import java.io.*;

public class BOJ2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        int m = 1;
        for (int i=0; i<n; i++) {
            if (m + 6*i >= n) {
                System.out.println(i);
                break;
            }
            m += 6*i;


        }
    }
}




