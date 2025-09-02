package 이코테.구현;

import java.util.*;
import java.io.*;

public class 게임개발 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int dir;
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        int cnt = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cx = Integer.parseInt(st2.nextToken());
        int cy = Integer.parseInt(st2.nextToken());
        dir = Integer.parseInt(st2.nextToken());
        for (int i=0 ; i<n; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st3.nextToken());
            }
        }

        while (true) {
            if (dir == 0 && matrix[x[2]][y[2]] == 1 ) {
                return;
            } else if (dir == 1 && matrix[x[3]][y[3]] == 1 ) {
                return;
            } else if (dir == 2 && matrix[x[0]][y[0]] == 1 ) {
                return;
            } else if (dir == 3 && matrix[x[1]][y[1]] == 1 ) {
                return;
            }
            if (dir > 0) {
                dir = -1;
            } else if (dir == 0) {
                dir = 3;
            }

            if (visited[cx + x[dir]][cy + y[dir]] == false && matrix[cx + x[dir]][cy + y[dir]] == 0) {
                visited[cx + x[dir]][cy + y[dir]] = true;
                cx += x[dir];
                cy += y[dir];
                cnt += 1;
            }

        }


    }
}
