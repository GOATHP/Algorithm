package 브루트포스;

import java.util.*;
import java.io.*;

public class BOJ19532 {

    public static void main (String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int i = -999; i<1000; i++) {
            for (int j = -999; j<1000; j++) {
                if (a*i + b*j == c && d*i + e*j == f) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

}
