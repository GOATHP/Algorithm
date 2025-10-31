package 이코테.그래프;

import java.util.*;
import java.io.*;

public class 팀결성 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int[] team = new int[v+1];
        for (int i=0; i<=v; i++) {
            team[i] = i;
        }
        for (int i=0; i<e; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st2.nextToken());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            if (c == 1) {
                if (findTeam(team, a) == findTeam(team, b) ) {
                    sb.append("YES");
                    sb.append("\n");
                    System.out.println("YES");
                } else {
                    sb.append("NO");
                    sb.append("\n");
                }
            } else {
                unionTeam(team, a, b);
            }
        }
        System.out.println(sb.toString());
    }

    public static int findTeam(int[] team, int a) {
        if (a != team[a]) {
            return team[a] = findTeam(team, team[a]);
        }
        return team[a];
    }

    public static void unionTeam(int[] team, int a, int b) {
        a = findTeam(team, a);
        b = findTeam(team, b);
        if (a != b) {
            if (a < b) {
                team[b] = a;
            } else {
                team[a] = b;
            }
        }
    }
}
