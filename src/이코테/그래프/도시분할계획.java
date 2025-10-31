package 이코테.그래프;

import java.util.*;
import java.io.*;

public class 도시분할계획 {

    public static int findParent(int[] parent, int x) {
        if (parent[x] != x) {
            return parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }

    public static void unionParent(int[] parent, int a, int b) {

        a = findParent(parent, a);
        b = findParent(parent, b);

        if (parent[a] == parent[b] ) {
            if(a < b) {
                parent[b] = a;
            } else {
                parent[a] = b;
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cities = Integer.parseInt(st.nextToken());
        int roads = Integer.parseInt(st.nextToken());
        int[] parent = new int[cities+1];

        int[][] edges = new int[cities][3];
        int result = 0;

        for (int i = 1; i <= cities; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < roads; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st2.nextToken());
            edges[i][1] = Integer.parseInt(st2.nextToken());
            edges[i][2] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
                }
            });

        for (int [] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int cost = edge[2];

            if (findParent(parent, a) != findParent(parent, b)) {
                unionParent(parent,a,b);
                result+=cost;
            }
        }

    }


}
