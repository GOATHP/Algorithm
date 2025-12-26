package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 모험가길드 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] team = new int[n+1];
        int cnt = 0;
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            team[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(team, 1, n+1);

        for (int i = 1; i<=n; i++) {
            cnt++;
            if (team[i] == cnt) {
                result++;
                cnt = 0;
            }
        }
        System.out.println(result);
    }

}
