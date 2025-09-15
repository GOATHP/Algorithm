package 이코테.BFSDFS;

import java.util.*;
import java.io.*;

public class 미로탈출 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[] xy = {0, 0};
        queue.add(xy);

        visited[xy[0]][xy[1]] = true;
        map[xy[0]][xy[1]] = 1;
        for(int i=0;i<n;i++){
            String input = br.readLine();
            for (int j=0;j<m;j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }
        while(!queue.isEmpty()) {
            int[] cxy = queue.poll();
            for (int i=0; i<4; i++) {
                int[] nxy = {cxy[0] + x[i], cxy[1] + y[i]};
                if (nxy[0] >=0 && nxy[1] >= 0 && nxy[0] < n && nxy[1] < m) {
                    if(!visited[nxy[0]][nxy[1]] && map[nxy[0]][nxy[1]] >= 1) {
                        queue.add(nxy);
                        visited[nxy[0]][nxy[1]] = true;
                        map[nxy[0]][nxy[1]] = map[cxy[0]][cxy[1]] + 1;
                    }
                }
            }
        }
        System.out.println(map[n-1][m-1]);
    }
}
