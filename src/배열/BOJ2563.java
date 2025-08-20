package 배열;

import java.util.*;
import java.io.*;

public class BOJ2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        int[][] papers = new int[101][101];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x; j<x+10; j++) {
                for (int k=y; k<y+10; k++) {
                    papers[j][k] = 1;
                }
            }
        }
        for (int i = 1; i<101; i++) {
            for (int j = 1; j < 101; j++) {
                if (papers[i][j] == 1) {
                    sum += 1;
                }
            }
        }
    System.out.println(sum);
    }

}
