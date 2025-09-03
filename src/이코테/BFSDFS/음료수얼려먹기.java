package 이코테.BFSDFS;

import java.util.*;
import java.io.*;

public class 음료수얼려먹기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int ices = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int cx = 0;
        int cy = 0;
        int nx = 0;
        int ny = 0;
        queue.add(new int[]{cx, cy});

        for (int i=0; i<n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = line.charAt(j) - '0';
            }
        }
        while(!queue.isEmpty()) {
            int[] xy = queue.poll();
            cx = xy[0];
            cy = xy[1];
            for (int i = 0; i < 4; i++) {
                nx = cx + dx[i];
                ny = cy + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && matrix[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
