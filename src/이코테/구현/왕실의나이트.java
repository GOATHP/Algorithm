package 이코테.구현;

import java.util.*;
import java.io.*;

public class 왕실의나이트 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        int cx = st.charAt(0) - 'a' + 1;
        int cy = st.charAt(1) - '0';
        int[] x = {2, 2, -2, -2, 1, -1, 1, -1};
        int[] y = {1, -1, 1, -1, 2, 2, -2, -2};
        int cnt = 0;

        for (int i=0; i<8;i++) {
            int nx = cx + x[i];
            int ny = cy + y[i];

            if (nx >= 1 && ny >= 1 && nx <= 8 && ny <= 8) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
