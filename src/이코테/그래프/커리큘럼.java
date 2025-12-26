package 이코테.그래프;

import java.util.*;
import java.io.*;

public class 커리큘럼 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] inDegree = new int[n+1]; //선수과목 수
        int[] time = new int[n+1]; // 각 강의 시간
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<=n; i++) graph[i] = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br2.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while(true) {
                int x = Integer.parseInt(st.nextToken());
                if (x == -1 ) break;
                inDegree[i] += 1;
                graph[x].add(i);
            }
        }
    }

    public static void topology_sort(int n, int[] time ,int[] inDegree,ArrayList<Integer>[] graph, ArrayDeque<Integer> queue) {
        int[] dp = new int[n+1];
        for (int i=1; i<=n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
                dp[i] = time[i];
            };
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : graph[now]) {
                inDegree[next]--;
                dp[next] = Math.max(dp[next], dp[now] + time[next]);
                if ( inDegree[next] == 0 ) {
                    queue.add(next);
                }
            }
        }

    }
}
