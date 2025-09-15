package 이코테.BFSDFS;

import java.util.*;
import java.io.*;

public class 음료수얼려먹기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j)-'0';
            }
        }
    }
    public static int dfs(int[][] map, int x, int y, boolean[][] visited, int cnt){


        if (!visited[x][y] && map[x][y] == 0) {
            return dfs(map, x-1, y, visited, cnt);

        }

        return cnt;
    }


}
