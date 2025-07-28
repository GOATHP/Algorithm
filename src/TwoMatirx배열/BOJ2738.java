package TwoMatirx배열;

import java.util.*;
import java.io.*;

public class BOJ2738 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixB[i][j] + matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
