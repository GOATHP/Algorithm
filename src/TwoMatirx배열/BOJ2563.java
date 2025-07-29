package TwoMatirx배열;

import java.util.*;
import java.io.*;

public class BOJ2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int max = n * 100;

        int[][] canvas = new int[100][100];
        boolean[][] booleanCanvas = new boolean[100][100];
        int[] xx = new int[100];
        int[] yy = new int[100];
        for (int i=0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            canvas[x][y] = 1;
            canvas[x+10][y+10] = 1;
        }
        for (int i=0; i < 100; i++) {
            for (int j=0; j < 100; j++) {
                if (canvas[i][j] > 0) {
                    xx[i] = i;
                    yy[j] = j;

                    System.out.println(i + "///" + j + "///" + canvas[i][j]);
                }
            }
        }
    }
}
