package 이코테.자주나오는유형.DFSBFS;

import java.util.*;
import java.io.*;

public class 연구소 {
    static int n;
    static int m;
    static int[][] matrix;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        matrix  = new int[n][m];

        for (int i=0;i<n;i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++) {
                matrix[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        int wallCnt=0;
        makeWall(matrix, wallCnt);
        System.out.println(min);
    }

    public static void makeWall(int[][] matrix, int wallCnt) {
        if (wallCnt == 3) {
            spreadVirus(matrix);
            countVirus();
            return;
        }
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                    wallCnt++;
                    makeWall(matrix, wallCnt);
                    matrix[i][j] = 0;
                    wallCnt--;
                }
            }
        }
    }

    public static void countVirus() {
        int cnt = 0;
        for (int i=0; i<n;i++) {
            for (int j=0; j<m;j++) {
                if (matrix[i][j] == 2) {
                    min = Math.min(cnt, min);
                }
            }
        }
    }

    public static void spreadVirus (int[][] matrix) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            int cx = xy[0];
            int cy = xy[1];

            for (int i=0;i<4;i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (matrix[nx][ny] == 0) {
                    matrix[nx][ny] = 2;
                    queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
