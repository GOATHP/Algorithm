package 브루트포스;

import java.util.*;
import java.io.*;

public class BOJ1436 {

    public static void main(String[] args ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(n / 10);

        if (n < 11) {
            if (n == 0) {
                System.out.println("666");
            } else {
                System.out.println(String.valueOf(n - 1) + "666");
            }
        } else {
            System.out.println("666" + String.valueOf(n % 10));
        }
    }
}
