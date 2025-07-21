package 반복문;

import java.util.*;
import java.io.*;

public class BOJ11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for ( int i = 1; i < n+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #"+i+": ");
            sb.append(a+b);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
