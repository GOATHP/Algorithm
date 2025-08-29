package 이코테.구현;

import java.util.*;
import java.io.*;

public class 상하좌우 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] matirx = new int[5][5];
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        // L - 0
        // R - 1
        // D - 2
        // U - 3

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cx = 1;
        int cy = 1;

        while ( st.hasMoreTokens() ) {

            String dir = st.nextToken();
            int idx = 0;

            if (dir.equals("U")) {
                idx = 0;
            } else if (dir.equals("D")) {
                idx = 1;
            } else if (dir.equals("L")) {
                idx = 2;
            } else if (dir.equals("R")) {
                idx = 3;
            }

            if (cx + x[idx] > 0 && cy + y[idx] > 0) {
                cx += x[idx];
                cy += y[idx];

            }
        }
        System.out.println(cx + " " + cy);
    }

}
