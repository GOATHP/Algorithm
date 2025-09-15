package 이코테.구현;

import java.util.*;
import java.io.*;

public class 게임개발 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cx = Integer.parseInt(st2.nextToken());
        int cy = Integer.parseInt(st2.nextToken());
        int dir = Integer.parseInt(st2.nextToken());
        boolean[][] visited = new boolean[n][m];
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        int cnt = 0;
        for (int i=0; i<n; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++) {
                map[i][j] = Integer.parseInt(st3.nextToken());
            }
        }
        while (true) {
            if (dir == 0) {
                dir = 3;
            } else {
                dir--;
            }
            int nx = cx + x[dir];
            int ny = cy + y[dir];
            if (map[nx][ny] != 1 || !visited[nx][ny]) {
                cx = nx;
                cy = ny;
                visited[nx][ny] = true;
                cnt++;
            } else {
                if (dir > 1) {
                    int nx2 = cx + x[dir - 2];
                    int ny2 = cy + y[dir - 2];
                    if (visited[nx2][ny2] || map[nx2][ny2] == 1) {
                        break;
                    } else {
                        cx = nx2;
                        cy = ny2;
                    }
                } else {
                    int nx2 = cx + x[dir + 2];
                    int ny2 = cy + y[dir + 2];
                    if (visited[nx2][ny2] || map[nx2][ny2] == 1) {
                        break;
                    } else {
                        cx = nx2;
                        cy = ny2;
                    }
                }
            }
        }
    System.out.println(cnt);
    }
}
