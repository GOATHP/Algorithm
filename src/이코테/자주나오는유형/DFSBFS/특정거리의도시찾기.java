package 이코테.자주나오는유형.DFSBFS;

import java.util.*;
import java.io.*;

public class 특정거리의도시찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int firstDepart = x;
        int[][] city = new int[n+1][n+1];
        int[][] result = new int[n+1][n+1];
        int cnt = 0;
        for (int i=0;i<m;i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int cx = Integer.parseInt(st2.nextToken());
            int cy = Integer.parseInt(st2.nextToken());
            city[cx][cy] = 1;
        }
        dfs(city, cnt, x, k, result);
    }

    public static void dfs(int[][] city, int cnt, int depart, int target, int[][] result) {

        int n = city.length;
        System.out.println("DFS 진입===>" + "cnt: " + cnt + " depart: " + depart + "result[depart][i]");

        if (cnt == target) {
            System.out.println(depart);
        }
        cnt++;

        System.out.println(result[1][depart]);
        for (int i=1;i<n;i++) {

            if (city[depart][i] == 1) {
                result[depart][i] = cnt;
                dfs(city, cnt, i, target, result);

            } else {
                continue;
            }
        }
    }
}
