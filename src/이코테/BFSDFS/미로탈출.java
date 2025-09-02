package 이코테.BFSDFS;

import java.util.*;
import java.io.*;

public class 미로탈출 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n][m];

        String line;

        while( (line = br.readLine()) != null && !line.isEmpty()) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    matrix[i][j] = line.charAt(i);
               }
            }
        }
    }
}
